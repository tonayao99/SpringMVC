/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.model.aspectj;

import org.springframework.stereotype.Component;

/**
 * @author Cenyol mail: mr.cenyol@gmail.com
 * @date 07/08/2017 11:33
 */
@Component
public class PerformanceImpl implements Performance{
    public void perform() {
        System.out.println("beginning perform...");
    }
}
