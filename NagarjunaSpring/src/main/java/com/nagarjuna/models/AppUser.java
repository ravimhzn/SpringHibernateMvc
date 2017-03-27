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

    public AppUser(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
}
