package com.boot.framwork.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private int age;

    private LocalDateTime accessTime;

    private boolean isMarried;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(LocalDateTime accessTime) {
        this.accessTime = accessTime;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

}
