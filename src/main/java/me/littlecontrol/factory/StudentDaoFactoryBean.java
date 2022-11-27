package me.littlecontrol.factory;

import me.littlecontrol.dao.StudentDao;
import me.littlecontrol.dao.impl.StudentDaoImol;
import org.springframework.beans.factory.FactoryBean;

public class StudentDaoFactoryBean implements FactoryBean<StudentDao> {

    @Override
    public StudentDao getObject() throws Exception {
        return new StudentDaoImol(123, "test");
    }

    @Override
    public Class<?> getObjectType() {
        return StudentDao.class;
    }

    //    默认为true， 及为单例模式，返回false即为非单例
    @Override
    public boolean isSingleton() {
//        return FactoryBean.super.isSingleton();
        return true;
    }
}
