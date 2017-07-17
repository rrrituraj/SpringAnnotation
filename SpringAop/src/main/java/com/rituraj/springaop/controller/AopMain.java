package com.rituraj.springaop.controller;

import com.rituraj.springaop.controller.SpringAopConfig;
import com.rituraj.springaop.controller.AccountServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by RITURAJ on 27-06-2017.
 */
public class AopMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringAopConfig.class);

        // context.refresh();
        AccountServiceImpl accountService = (AccountServiceImpl) context.getBean("accountservice");
        accountService.updateAccountBalance(new Account(12393,"Mera Account hai"),1000L);
        // accountService.updateAccountBalance(new Account("123","Default"),1000L);
        context.close();
    }
}
