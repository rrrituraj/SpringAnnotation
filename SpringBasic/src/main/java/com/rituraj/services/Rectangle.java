package com.rituraj.services;

/**
 * Created by RITURAJ on 13-06-2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rectangles")
public class Rectangle implements Shape {
    private int size;
    private Dimension dimension;

    /* public Rectangle() {
     }*/
    @Autowired
    public Rectangle(Dimension dimension) {
        this.dimension = dimension;
       // dimension.getDimension();
    }

    public void getShape() {
        System.out.println("---------Rectangle-----------");
        return;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

