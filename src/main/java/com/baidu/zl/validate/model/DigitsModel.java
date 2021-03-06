/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.validate.model;

import javax.validation.constraints.Digits;

public class DigitsModel {

    //验证注解的元素值的整数位数和小数位数上限
    @Digits(integer = 5, fraction = 2)
    private float value;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

}
