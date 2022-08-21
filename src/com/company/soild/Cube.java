package com.company.soild;

public class Cube implements Shape, IThreeDimensionalShape{
    @Override
    public double area() {
        return 40;
    }

    @Override
    public double volume() {
        return 0;
    }
}
