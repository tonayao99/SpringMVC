/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.support.converter;

import org.springframework.core.convert.converter.Converter;

public class StringToIntegerConverter implements Converter<String, Integer> {


    public Integer convert(String source) {
        return Integer.valueOf(source);
    }

}
