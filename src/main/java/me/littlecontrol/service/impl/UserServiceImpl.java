package me.littlecontrol.service.impl;

import me.littlecontrol.dao.UserDao;
import me.littlecontrol.dao.impl.UserDaoImpl;
import me.littlecontrol.service.UserService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean, DisposableBean {
    private final UserDao userDao = new UserDaoImpl();

    public UserServiceImpl() {
        System.out.println("UserServiceImpl Constructor");
    }

    public void save() {
        System.out.println("Service Saving");
        userDao.save();

    }

    public void setUserDao(UserDaoImpl userDao) {
        System.out.println("setUserDao");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service Distory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
