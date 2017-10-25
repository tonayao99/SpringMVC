/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.validate.model;

import javax.validation.constraints.Min;

public class RecursionModel2 {

    @Min(value = 10)
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
