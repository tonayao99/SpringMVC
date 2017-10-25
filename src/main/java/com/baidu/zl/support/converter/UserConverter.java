/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.support.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.baidu.zl.model.User;

/**
 * ${DESCRIPTION}
 *
 * @author ZhangLiang24
 * @create on 17/10/23.
 */

@Component
public class UserConverter implements Converter<String, User> {

    public User convert(String src) {
        if(src != null){
            String[] vals= src.split("-");
            if(vals != null && vals.length ==3){
                Integer id =Integer.parseInt(vals[0]);
                String username =vals[1];
                String password =vals[2];
                User user =new User();
                user.setId(id);
                user.setUserName(username);
                user.setPassword(password);
                return user;
            }
        }
        return null;
    }
}
