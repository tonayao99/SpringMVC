/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.model;

/**
 * 用户状态
 */
public enum UserState {

    normal("正常状态"), blocked("锁定");

    private String desc;

    private UserState(String desc) {
        this.desc = desc;
        ;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return this.desc;
    }

}
