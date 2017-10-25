/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.support.converter;

import org.springframework.core.convert.converter.Converter;

import com.baidu.zl.model.PhoneNumberModel;

// PhoneNumberModel------>String
public class PhoneNumberToStringConverter implements Converter<PhoneNumberModel, String> {

    public String convert(PhoneNumberModel source) {

        if (source == null) {
            return "";
        }

        return new StringBuilder()
                .append(source.getAreaCode()).append("-")
                .append(source.getPhoneNumber()).toString();

    }

}
