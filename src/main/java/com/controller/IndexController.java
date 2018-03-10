package com.controller;

import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "")
    public String indexPage(){
       /* return "/admin/adminLogin";*/
       return "/customer/index";
    }

    @RequestMapping(value = "/customerIndex.do")
    public String customerIndex(HttpServletRequest request, Customer customer , Model model, HttpSession session){
        Cookie[] cookies = request.getCookies();

        if(cookies == null){
            return "redirect: /customer/login.view";
        }

        String customerName = null;
        String customerPassword = null;
        for (Cookie cookie : cookies) {
            if("customerName".equals(cookie.getName())){
                customerName = cookie.getValue();
            }
            if("customerPassword".equals(cookie.getName())){
                customerPassword = cookie.getValue();
            }
        }
        customer.setCustomerName(customerName);
        customer.setCustomerPassword(customerPassword);
        System.out.println(customer);
        customer = customerService.queryCustomerByName(customer);

        if(customer == null){
            model.addAttribute("info", "µÇÂ¼Ê§°Ü");
            return "redirect:/customer/login.view";
        }
        session.setAttribute("customer",customer);
        model.addAttribute("info","µÇÂ½³É¹¦");
        return "success";

    }

   /* @RequestMapping(value = "/adminIndex.do")
    public   String   adminIndex(){
        return null;
    }
*/


}
