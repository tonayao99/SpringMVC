/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.DesignPattern.observerpattern.subject;

import com.baidu.zl.DesignPattern.observerpattern.observer.Observer;

/**
 * ${DESCRIPTION}
 *
 * @author ZhangLiang24
 * @create on 18/1/25.
 */

public interface Subject {
    /**
     * 增加订阅者
     *
     * @param observer
     */
    public void attach(Observer observer);

    /**
     * 删除订阅者
     *
     * @param observer
     */
    public void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     */
    public void notify(String message);
}
