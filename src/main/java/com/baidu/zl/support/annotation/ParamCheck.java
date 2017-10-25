/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Func: 验证字段必须取某个值
 * Author : zhangliang
 * Mail: zhangliang24@baidu.com
 * PS:
 */
@Target( {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ParamCheckImpl.class)
public @interface ParamCheck {
    String message() default "check failed!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String[] value();
}
