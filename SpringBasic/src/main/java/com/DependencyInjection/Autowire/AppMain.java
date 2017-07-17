package com.DependencyInjection.Autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by RITURAJ on 17-07-2017.
 */
public class AppMain {
    public static void main(String[] args) {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        /*
        By Autowiring on Setter method
        Setter Dependency Injection
         */
        Driver driver=(Driver)context.getBean("driver");
        System.out.println("Driver Details : " +driver);

        /*
        By Autowiring on Field
        Field Dependency Injection
         */
        Driver1 driver1=(Driver1)context.getBean("driver1");
        System.out.println("Driver Details : " +driver1);

         /*
        By Autowiring on Constructor
        Constructor Dependency Injection
         */
        Driver2 driver2=(Driver2)context.getBean("driver2");
        System.out.println("Driver Details : " +driver2);
    }
}
