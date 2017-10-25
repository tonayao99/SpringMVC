/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.zl.support.ResponseEnvelope;

@Controller
public class SuccessController {

    @RequestMapping("/zlTest")
    @ResponseBody
    public Object zlTest() {
        return ResponseEnvelope.ofOk().add("message", "zl is in！").end();
    }
}
