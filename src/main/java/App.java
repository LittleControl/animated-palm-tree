import me.littlecontrol.dao.UserDao;
import me.littlecontrol.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) ctx.getBean("userService");
//        UserService userService1 = (UserService) ctx.getBean("userService");
//        UserDao userDao = (UserDao) ctx.getBean("dao");
//        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
//        System.out.println(userDao);
//        System.out.println(userDao1);
//        System.out.println(userService);
//        System.out.println(userService1);
//
//        StudentDao studentDao = (StudentDao) ctx.getBean("studentDao");
//        studentDao.check();

//        StudentDao studentDao2 = (StudentDao) ctx.getBean("studentDao2");
//        studentDao2.check();

//        StudentDao studentDao3 = (StudentDao) ctx.getBean("studentDao3");
//        studentDao3.check();

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ctx.getBean("dao");
        UserService userDaoService = (UserService) ctx.getBean("service");
        userDao.save();
//        ctx.registerShutdownHook();
        ctx.close();
    }
}
