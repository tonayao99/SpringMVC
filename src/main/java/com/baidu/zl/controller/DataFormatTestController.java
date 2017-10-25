/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.zl.model.FormatterModel;
import com.baidu.zl.model.PhoneNumberModel;
import com.baidu.zl.model.User;
import com.baidu.zl.model.UserModel;
import com.baidu.zl.support.formatter.PhoneNumber;

@Controller
public class DataFormatTestController {
    @RequestMapping(value = "/zl")
    @ResponseBody
    public String connect() {
        System.out.println("zl");
        return "format/success";
    }
    //http://localhost:9080/springmvc-chapter7/format1?totalCount=100000&discount=0.51&sumMoney=100000
	// .128&phoneNumber=010-12345678
    @RequestMapping(value = "/format1")
    public String test1(@Valid @ModelAttribute("model") FormatterModel formatModel) {

        return "format/success";
    }

    //http://localhost:9080/springmvc-chapter7/format2?phoneNumber=010-12345678&date=2012-05-01
    @RequestMapping(value = "/format2")
    public String test2(
            @PhoneNumber @RequestParam("phoneNumberModel") PhoneNumberModel phoneNumberModel) {
        System.out.println(phoneNumberModel);
        // System.out.println(date);
        return "format/success2";
    }

    // http://localhost:8081/testUser?user=1-2-3
    @RequestMapping("/testUser" )
    @ResponseBody
    public Object testConverter(@RequestParam("user") User user){
        System.out.println(user);
        return user;
    }

    // /testConverterFormatterValidator?phoneNumber=010-12345678&date=2012-05-01&user=1-2-3&usename=123&password=zl
    @RequestMapping("/testConverterFormatterValidator" )
    @ResponseBody
    public Object testConverterFormatterValidator(@RequestParam("user") User user, @RequestParam("phoneNumber") PhoneNumberModel phoneNumberModelc, @Valid
    @ModelAttribute("userModel") UserModel userModel, Errors errors){
        System.out.println(user);
        return user;
    }

    // /testValidator
    @RequestMapping("/testValidator" )
    @ResponseBody
    public Object testValidator(@Valid
    @ModelAttribute("userModel") UserModel userModel, Errors errors){
        System.out.println(userModel);
        return userModel;
    }
}
