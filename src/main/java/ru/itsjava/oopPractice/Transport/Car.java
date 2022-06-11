package ru.itsjava.oopPractice.Transport;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private final String model;
    private final String color;
    private static double price = 10000.00;

    public double getPrice() {
        return this.price;
    }
}
