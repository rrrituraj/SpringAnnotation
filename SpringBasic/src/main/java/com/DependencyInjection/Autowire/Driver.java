package com.DependencyInjection.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by RITURAJ on 17-07-2017.
 */
@Component("driver")
public class Driver {

    private License license;

    @Autowired
    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver [license=" + license + "]";
    }
}
