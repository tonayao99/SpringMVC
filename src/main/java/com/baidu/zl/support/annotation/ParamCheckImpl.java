/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.support.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * ${DESCRIPTION}
 *
 * @author ZhangLiang24
 * @create on 16/10/17.
 */

public class ParamCheckImpl implements ConstraintValidator<ParamCheck,String> {
    private String[] value;
    public void initialize(ParamCheck paramCheck) {
        this.value = paramCheck.value();
    }

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("haha");
        if(null != value && value.length > 0){
            for(String item : value){
                if(item.equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
