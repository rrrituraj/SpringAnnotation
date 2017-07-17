package com.DependencyInjection.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by RITURAJ on 17-07-2017.
 */
@Component("driver2")
public class Driver2 {
    private License license;

    @Autowired
    public Driver2(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver2 [license=" + license + "]";
    }
}
