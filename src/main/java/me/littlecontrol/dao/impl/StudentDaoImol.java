package me.littlecontrol.dao.impl;

import me.littlecontrol.dao.StudentDao;

public class StudentDaoImol implements StudentDao {

    private int stuId;
    private String stuName;

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public void check() {
        System.out.println("Implent StudentDao..." + "," + stuId + "," + stuName);
    }
}
