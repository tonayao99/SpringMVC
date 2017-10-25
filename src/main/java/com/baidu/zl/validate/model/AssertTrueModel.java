/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.validate.model;

import javax.validation.constraints.AssertTrue;

public class AssertTrueModel {

    //验证注解的元素值是true
    @AssertTrue
    private boolean value;

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

}
