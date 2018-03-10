package com.controller;

import com.po.Customer;
import com.service.CustomerService;
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
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/reg.view")
    public String regPage(){
        return "customer/register";
    }

    @RequestMapping(value = "/reg.do")
    public String customerRegister(@ModelAttribute Customer customer, HttpSession session, Model model){
        System.out.println("����֮ǰ"+customer);
        boolean addFlag = customerService.addCustomer(customer);
        System.out.println("����֮��"+customer);
        if(addFlag){
            model.addAttribute("info","ע��ɹ�");
            session.setAttribute("customer", customer);
            return "success";
        }
        model.addAttribute("info","ע��ʧ��");
        return "customer/index";
    }

    @RequestMapping(value = "/login.view")
    public String loginPage(){
        return "customer/login";
    }

    @RequestMapping(value = "/login.do")
    public String login(@ModelAttribute Customer customer, HttpSession session
            , Model model, HttpServletResponse response
            , @RequestParam(value = "isremember" ,required = false) String isremember){
        System.out.println("��½֮ǰ"+ customer);
        customer  = customerService.queryCustomerByName(customer);
        if(customer == null){
           model.addAttribute("info", "��¼ʧ��");
           return "customer/index";
        }
        System.out.println(isremember);
        if("on".equals(isremember)){
            Cookie cookieName = new Cookie("customerName", customer.getCustomerName());
            cookieName.setMaxAge(60*60*24*7);
            cookieName.setPath("/");
            Cookie cookiePassword = new Cookie("customerPassword", customer.getCustomerPassword());
            cookiePassword.setMaxAge(60*60*24*7);
            cookiePassword.setPath("/");
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);

        }


        session.setAttribute("customer", customer);
        model.addAttribute("info","��¼�ɹ�");
        return "success";
    }

    @RequestMapping("/customer.info")
    public   String   customerInfo(){
        return  "success";

    }

}
