import com.eddy.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)  ctx.getBean("user");
        System.out.println("***************************user************************");
        System.out.println(user);

        System.out.println("***************************user2************************");
        User user2 = (User)  ctx.getBean("user2");
        System.out.println(user2);

        System.out.println("***************************user3************************");
        User user3 = (User)  ctx.getBean("user3");
        System.out.println(user3);

        System.out.println("***************************user4************************");
        User user4 = (User)  ctx.getBean("user4");
        System.out.println(user4);
    }
}
