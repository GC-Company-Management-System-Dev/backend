package com.yeogi.infoseccert.domain;

import javax.persistence.*;

@Entity
@Table(name = "Login_Account_Management")
public class LoginAccountManagement {
    @Id
    @Column(name = "Login_ID")
    private String loginId;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    // Getters and setters

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

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
}

