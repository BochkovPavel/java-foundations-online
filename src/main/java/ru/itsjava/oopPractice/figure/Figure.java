package ru.itsjava.oopPractice.figure;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Figure {
    public static final double PI = 3.14;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
