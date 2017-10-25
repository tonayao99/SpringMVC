/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.model.autowire.interfaces.impl;

import com.baidu.zl.model.autowire.interfaces.CompactDisc;

/**
 * @author Cenyol mail: mr.cenyol@gmail.com
 * @date 07/08/2017 10:45
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
