package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "product")
public class ProductController {
    @RequestMapping(value = "/operProduct/{id}/{oper}")
    public String updateProduct(@PathVariable(value = "id") Integer id, @PathVariable(value = "oper") String oper){
        System.out.println(id);
        System.out.println(oper);
        return "success";
    }
}
