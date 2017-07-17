package com.DependencyInjection.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by RITURAJ on 17-07-2017.
 */
@Component("bond")
public class Bond {
    @Autowired
    @Qualifier("Ferrari")
    private Car car;

    public void showCar(){
        System.out.print("Bond drives: ");
        car.getCarName();
    }
}
