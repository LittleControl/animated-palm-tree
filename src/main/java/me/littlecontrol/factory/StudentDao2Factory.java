package me.littlecontrol.factory;

import me.littlecontrol.dao.StudentDao;
import me.littlecontrol.dao.impl.StudentDaoImol;

public class StudentDao2Factory {
    public StudentDao getStudentDao() {
        return new StudentDaoImol(123, "test");
    }
}
