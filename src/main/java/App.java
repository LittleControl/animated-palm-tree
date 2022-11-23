import me.littlecontrol.dao.UserDao;
import me.littlecontrol.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        UserService userService1 = (UserService) ctx.getBean("userService");
        UserDao userDao = (UserDao) ctx.getBean("dao");
        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao);
        System.out.println(userDao1);
//        System.out.println(userService);
//        System.out.println(userService1);
    }
}
