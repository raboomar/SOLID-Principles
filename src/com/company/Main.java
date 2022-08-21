package com.company;

import com.company.soild.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        List<Shape> shapes = List.of(circle,square,cube);
        int sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(sum));
    }
}
