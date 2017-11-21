package com.timma.work.model.user;

import java.io.Serializable;

/**
 * @Description: 用户信息
 * @Author: hzwangzhichao1@corp.netease.com
 * @Date: 2017/11/20
 */
public class UserInfo implements Serializable{

    private static final long serialVersionUID = 976732947542307781L;

    private String userId;

    private String userName;

    private String password;

    private int age;

    private boolean sex;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

}
