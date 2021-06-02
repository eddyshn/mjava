import com.eddy.javaconfig.JavaConfig;
import com.eddy.javaconfig.SayHello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        SayHello hello = ctx.getBean(SayHello.class);
        System.out.println(hello.sayHello("eddy"));

//        SayHello hello2 = (SayHello)ctx.getBean("hell2");
//        System.out.println(hello2.sayHello("eddy"));
    }

}
