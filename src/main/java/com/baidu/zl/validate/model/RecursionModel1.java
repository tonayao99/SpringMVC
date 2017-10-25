/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.validate.model;

import org.hibernate.validator.constraints.Length;

public class RecursionModel1 {

    @Length(min = 2, max = 10)
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
