/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.validate.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class A {

    @NotNull
    @Length(min = 2, max = 10)
    private String a;

    public void setA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }
}
