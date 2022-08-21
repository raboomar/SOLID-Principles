package com.company.soild;

public class NoShape implements Shape{

    @Override
    public double area() {
        throw new IllegalStateException("cant not calculate area");
    }
}
