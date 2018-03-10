package com.controller;

import com.po.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AdminIndexController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/adminIndex.do")
    public String customerIndex(HttpServletRequest request, Admin admin, Model model, HttpSession session){
        Cookie[] cookies = request.getCookies();

        if(cookies == null){
            return "redirect: /admin/adminLogin.view";
        }

        String adminName = null;
        String adminPassword = null;
        for (Cookie cookie : cookies) {
            if("adminName".equals(cookie.getName())){
                adminName = cookie.getValue();
            }
            if("adminPassword".equals(cookie.getName())){
                adminPassword = cookie.getValue();
            }
        }
        admin.setAdminName(adminName);
        admin.setAdminPassword(adminPassword);
        System.out.println(admin);
        admin = adminService.queryAdminByName(admin);

        if(admin == null){
            model.addAttribute("info", "µÇÂ¼Ê§°Ü");
            return "redirect:/admin/adminLogin.view";
        }
        session.setAttribute("admin",admin);
        model.addAttribute("info","µÇÂ½³É¹¦");
        return "success";

    }

}
