package com.DependencyInjection.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by RITURAJ on 17-07-2017.
 */
@Component("driver1")
public class Driver1 {
    @Autowired
    private License license;

    @Override
    public String toString() {
        return "Driver1 [license=" + license + "]";
    }
}
