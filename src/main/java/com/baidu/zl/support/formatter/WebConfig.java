/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.support.formatter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ${DESCRIPTION}
 *
 * @author ZhangLiang24
 * @create on 17/10/24.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.baidu.zl.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        PhoneNumberFormatAnnotationFormatterFactory annoFormater = new PhoneNumberFormatAnnotationFormatterFactory();
        registry.addFormatterForFieldAnnotation(annoFormater);
    }
}