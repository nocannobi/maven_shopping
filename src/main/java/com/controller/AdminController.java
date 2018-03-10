package com.controller;

import com.po.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/adminLogin.view")
    public String adminLoginPage(){
        return "admin/adminLogin";
    }

    @RequestMapping(value = "/adminLogin.do")
    public String adminLogin(@ModelAttribute Admin admin, Model model, HttpSession session
            , @RequestParam(value = "isremember" ,required = false) String isremember
            , HttpServletResponse response){
        System.out.println("µÇÂ¼Ö®Ç°"+ admin);
        admin = adminService.queryAdminByName(admin);
        System.out.println("µÇÂ½Ö®ºó"+ admin);
        if(admin == null){
            model.addAttribute("info", "µÇÂ¼Ê§°Ü");
            return "admin/adminLogin";
        }
        System.out.println(isremember);
        if("on".equals(isremember)){
            Cookie cookieName = new Cookie("adminName", admin.getAdminName());
            cookieName.setMaxAge(60*60*24*7);
            cookieName.setPath("/");
            Cookie cookiePassword = new Cookie("cookiePassword", admin.getAdminPassword());
            cookiePassword.setMaxAge(60*60*24*7);
            cookiePassword.setPath("/");
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);
        }
        model.addAttribute("info", "µÇÂ½³É¹¦");
        session.setAttribute("admin",admin);
        return "admin/adminIndex";
    }

}
