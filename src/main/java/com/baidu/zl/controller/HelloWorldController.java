/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.zl.model.UserModel;

@Controller
public class HelloWorldController {

    @RequestMapping("/validate/hello")
    public String validate(@Valid @ModelAttribute("userModel") UserModel user, Errors errors) {

        if (errors.hasErrors()) {
            return "validate/error";
        }
        return "redirect:/success";
    }
    @RequestMapping("/hello")
    @ResponseBody
    public Object hehe(@Valid UserModel user,Errors errors) {
        if(errors.hasFieldErrors()){
            System.out.println("wrong");
        }
        System.out.println("in");
        return "ssss";
    }
}
