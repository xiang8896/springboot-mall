package com.xiang.springbootmall.model;

import java.util.Date;

public class User {
    private Integer userId;
    private String email;
    private String password;
    private Date createdDate;
    private Date lastModifiedDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_date() {
        return createdDate;
    }

    public void setCreated_date(Date created_date) {
        this.createdDate = created_date;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
