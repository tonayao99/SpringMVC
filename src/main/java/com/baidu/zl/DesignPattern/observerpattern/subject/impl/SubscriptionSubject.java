/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.DesignPattern.observerpattern.subject.impl;

import java.util.ArrayList;
import java.util.List;

import com.baidu.zl.DesignPattern.observerpattern.observer.Observer;
import com.baidu.zl.DesignPattern.observerpattern.subject.Subject;

/**
 * ${DESCRIPTION}
 *
 * @author ZhangLiang24
 * @create on 18/1/25.
 */

public class SubscriptionSubject implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
