package com.login.service;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
    protected int userId;
    protected String userName;
    protected String pass;

    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
