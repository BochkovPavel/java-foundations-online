package ru.itsjava.oopPractice.figure;

public class Rectangle extends Figure {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return (a * b);
    }

    @Override
    public double calculatePerimeter() {
        return (2 * (a + b));
    }
}