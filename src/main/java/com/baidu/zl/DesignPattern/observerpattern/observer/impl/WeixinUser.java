/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.DesignPattern.observerpattern.observer.impl;

import com.baidu.zl.DesignPattern.observerpattern.observer.Observer;

/**
 * ${DESCRIPTION}
 *
 * @author ZhangLiang24
 * @create on 18/1/25.
 */

public class WeixinUser implements Observer {
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "-" + message);
    }

}