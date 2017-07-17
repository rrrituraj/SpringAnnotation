package com.Basics.Client;

import com.Basics.Model.Message;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by RITURAJ on 17-07-2017.
 */
public class ClientMessage {
    public static void main(String[] args) {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
        Message msg=(Message)context.getBean("msg");
        msg.setMessageId(123);
        System.out.println(msg.getMessageId());
        Message msg1=(Message)context.getBean("msg");
        System.out.println(msg1.getMessageId());
        context.close();
    }
}
