package me.littlecontrol.service.impl;

import me.littlecontrol.dao.UserDao;
import me.littlecontrol.dao.impl.UserDaoImpl;
import me.littlecontrol.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoImpl();

    public void save() {
        System.out.println("Service Saving");
        userDao.save();

    }
}
