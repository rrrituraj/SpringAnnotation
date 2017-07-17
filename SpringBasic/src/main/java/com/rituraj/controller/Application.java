package com.rituraj.controller;

import com.rituraj.services.Rectangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.rituraj.services.Dimension;

import java.security.PublicKey;

/**
 * Created by RITURAJ on 13-06-2017.
 */
@Configuration
@ComponentScan(basePackages = "com.rituraj")
public class Application {

    @Bean(name = "setSizeRectangle")
    public Rectangle getRecSize(){
        Rectangle rec=new Rectangle(getDimension());
        rec.setSize(2);
        return rec;
    }
    @Bean
    public Dimension getDimension(){
        return new Dimension();
    }
}
