package ru.itsjava.oopPractice.figure;

public class Triangle extends Figure {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
    }

    @Override
    public double calculatePerimeter() {
        return (a + b + c);
    }
}
