package com.nagarjuna.models;


import javax.persistence.Column;
import javax.persistence.Id;

public class AppUser {

    @Id
    int id;
    @Column
    String userName;
    @Column
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
