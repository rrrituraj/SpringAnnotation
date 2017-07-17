package com.rituraj.controller;

import com.rituraj.services.Dimension;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.rituraj.services.Rectangle;

/**
 * Created by RITURAJ on 14-06-2017.
 */
@Configuration
public class ApplicationTwo {
    @Bean(name = "setSizeRectangle1")
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
