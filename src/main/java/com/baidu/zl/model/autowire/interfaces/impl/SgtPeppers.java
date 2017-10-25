/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.model.autowire.interfaces.impl;

import com.baidu.zl.model.autowire.interfaces.CompactDisc;

import org.springframework.stereotype.Component;

/**
 * @author Cenyol mail: mr.cenyol@gmail.com
 * @date 04/08/2017 21:26
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Bearles";
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
