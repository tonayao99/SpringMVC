/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.zl.model.DataBinderTestModel;

@Controller
public class DataBinderTestController {
    public DataBinderTestController() {
        System.out.println("DataBinderTestController我被创建了");
    }

    @RequestMapping(value = "/dataBind")
    public String test(DataBinderTestModel command, Model model) {

        //输出command对象看看是否绑定正确
        System.out.println(command);
        model.addAttribute("dataBinderTest", command);
        return "bind/success";
    }

    @RequestMapping(value = "/test")
    public String testAction(DataBinderTestModel command, Model model) {

        //输出command对象看看是否绑定正确
        System.out.println("进来了");
        return "success";
    }

  /*  @InitBinder
    //此处的参数也可以是ServletRequestDataBinder类型
    public void initBinder(ServletRequestDataBinder binder) throws Exception {
        //注册自定义的属性编辑器
        //1、日期
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        CustomDateEditor dateEditor = new CustomDateEditor(df, true);
        //表示如果命令对象有Date类型的属性，将使用该属性编辑器进行类型转换
        binder.registerCustomEditor(Date.class, dateEditor);
        System.out.println("进来了initBinder");
        //自定义的电话号码编辑器(和【4.16.1、数据类型转换】一样)
        binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberEditor());

    }*/

}
