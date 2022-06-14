package ru.itsjava.oopPractice.figure;

public class Square extends Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double calculatePerimeter() {
        return (a * 4);
    }
}
