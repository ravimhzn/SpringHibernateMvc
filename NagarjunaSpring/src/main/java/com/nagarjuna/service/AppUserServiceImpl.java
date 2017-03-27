package com.nagarjuna.service;


import com.nagarjuna.models.AppUser;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void createUser(AppUser appUser) {
        sessionFactory.getCurrentSession().save(appUser);
    }
}
