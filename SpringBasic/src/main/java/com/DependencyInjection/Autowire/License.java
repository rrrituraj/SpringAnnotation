package com.DependencyInjection.Autowire;

import org.springframework.stereotype.Component;

/**
 * Created by RITURAJ on 17-07-2017.
 */
@Component("license")
public class License {
    private String licNumber="123ABC";

    @Override
    public String toString() {
        return "License [number=" + licNumber + "]";
    }
}
