package me.littlecontrol.service.impl;

import me.littlecontrol.dao.StudentDao;
import me.littlecontrol.dao.UserDao;
import me.littlecontrol.service.UserService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean, DisposableBean {
    private UserDao userDao;
    private StudentDao studentDao;

//    public UserServiceImpl() {
//        System.out.println("UserServiceImpl Constructor");
//    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void save() {
        System.out.println("Service Saving");
        userDao.save();
        studentDao.check();
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
