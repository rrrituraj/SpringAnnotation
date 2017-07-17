package com.DependencyInjection.Qualifier;

import org.springframework.stereotype.Component;

/**
 * Created by RITURAJ on 17-07-2017.
 */
@Component("Mustang")
public class Mustang implements Car {
    public void getCarName() {
        System.out.println("This is Mustang");
    }
}
