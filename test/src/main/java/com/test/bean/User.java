package com.test.bean;

import java.util.Date;

public class User {
    private Long userId;

    private String userName;

    private String password;

    private String sex;

    private Long age;

    private String phoneNumber;

    private Date creationDate;

    private Date lastUpdateDate;

    private String comments;

    public User(Long userId, String userName, String password, String sex, Long age, String phoneNumber, Date creationDate, Date lastUpdateDate, String comments) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.comments = comments;
    }

    public User(Long userId, String userName, String sex, Long age, String phoneNumber, String comments) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.comments = comments;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}