/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.DesignPattern.observerpattern.main;

import com.baidu.zl.DesignPattern.observerpattern.observer.impl.WeixinUser;
import com.baidu.zl.DesignPattern.observerpattern.subject.impl.SubscriptionSubject;

/**
 * ${DESCRIPTION}
 *
 * @author ZhangLiang24
 * @create on 18/1/25.
 */

public class Main {
    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();
        //创建微信用户
        WeixinUser user1=new WeixinUser("杨影枫");
        WeixinUser user2=new WeixinUser("月眉儿");
        WeixinUser user3=new WeixinUser("紫轩");
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("刘望舒的专栏更新了");
    }
}
