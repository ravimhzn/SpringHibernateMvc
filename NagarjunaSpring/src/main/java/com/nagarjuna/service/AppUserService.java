package com.nagarjuna.service;

import com.nagarjuna.models.AppUser;
import org.springframework.stereotype.Repository;


public interface AppUserService{
    void createUser(AppUser appUser);
}
