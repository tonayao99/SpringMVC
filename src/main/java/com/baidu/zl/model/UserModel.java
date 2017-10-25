/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.model;

import javax.validation.constraints.NotNull;

import com.baidu.zl.support.annotation.ParamCheck;

public class UserModel {

    @NotNull(message = "{username.not.empty}")
    private String username;
    @ParamCheck(value = {"zl","test"} ,message = "wrong check")
    private String password;

    //真实姓名
    private String realname;

    private WorkInfoModel workInfo;

    private SchoolInfoModel schoolInfo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public SchoolInfoModel getSchoolInfo() {
        return schoolInfo;
    }

    public void setSchoolInfo(SchoolInfoModel schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public WorkInfoModel getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(WorkInfoModel workInfo) {
        this.workInfo = workInfo;
    }

    @Override
    public String toString() {
        return "UserModel [username=" + username + ", password=" + password
                + ", realname=" + realname + ", workInfo=" + workInfo
                + ", schoolInfo=" + schoolInfo + "]";
    }

}
