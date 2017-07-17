package com.DependencyInjection.Qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by RITURAJ on 17-07-2017.
 */
public class AppMain {
    public static void main(String[] args) {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Bond bond=(Bond)context.getBean("bond");
        bond.showCar();
        context.close();
    }
}
