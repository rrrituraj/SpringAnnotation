package com.jdbc;

import com.jdbc.Repository.DataSourceConfiguration;
import com.jdbc.Services.REl_BKP;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        REl_BKP rl=(REl_BKP)context.getBean("rel_bckp");
        rl.getValue();
        context.close();
    }
}
