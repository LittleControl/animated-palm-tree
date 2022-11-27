package me.littlecontrol.dao.impl;

import me.littlecontrol.dao.StudentDao;

public class StudentDaoImol implements StudentDao {

    private final int stuId;
    private final String stuName;


    public StudentDaoImol(int stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

//    public StudentDaoImol() {
//        this.stuId = 123;
//        this.stuName = "test";
//    }

    @Override
    public void check() {
        System.out.println("Implent StudentDao..." + "," + stuId + "," + stuName);
    }
}
