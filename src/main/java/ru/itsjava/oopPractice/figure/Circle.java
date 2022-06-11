package ru.itsjava.oopPractice.figure;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Figure {
    private final double radius;

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
