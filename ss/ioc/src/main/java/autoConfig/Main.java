package autoConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AutoConfig.class);
        AutoUser user = ctx.getBean(AutoUser.class);
        System.out.println(user.test());

    }
}
