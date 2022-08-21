package com.company;

import com.company.soild.AreaCalculator;
import com.company.soild.Circle;
import com.company.soild.ShapesPrinter;
import com.company.soild.Square;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        List<Object> shapes = List.of(circle,square);
        int sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(sum));
    }
}
