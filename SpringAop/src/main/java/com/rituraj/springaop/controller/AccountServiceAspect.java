package com.rituraj.springaop.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Aspect
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@Service
public class AccountServiceAspect {

    @After("execution(* com.rituraj.springaop.controller.AccountServiceImpl.updateAccountBalance(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        //System.out.println("Aspect chala gya " +"BC");
        System.out.println("AfterMethod-  "
                +joinPoint.getSignature().getName()+"\nClass "+joinPoint.getTarget().getClass().getSimpleName());
    }
}
