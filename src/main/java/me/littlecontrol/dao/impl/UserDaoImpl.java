package me.littlecontrol.dao.impl;

import me.littlecontrol.dao.UserDao;

public class UserDaoImpl implements UserDao {
//    public UserDaoImpl() {
//        System.out.println("UserDaoImpl private struct function");
//    }

    public void save() {
        System.out.println("UserDao Saved!");
    }

    public void init() {
        System.out.println("init...");
    }

    public void destory() {
        System.out.println("Destory ...");
    }
}
