package javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

        //singletone
//        SayHello hello = ctx.getBean(SayHello.class);
//        System.out.println(hello.sayHello("eddy"));

        SayHello hello2 = (SayHello)ctx.getBean("hell2"); //bean name
        System.out.println(hello2.sayHello("eddy"));
    }

}
