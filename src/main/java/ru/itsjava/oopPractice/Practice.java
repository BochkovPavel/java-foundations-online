package ru.itsjava.oopPractice;

import ru.itsjava.oopPractice.Birds.Crow;
import ru.itsjava.oopPractice.Transport.Bus;
import ru.itsjava.oopPractice.Transport.Car;

public class Practice {
    public static void main(String[] args) {
        Car car = new Car("Бентли", "Зеленый");
        Car car1 = new Car("Жигули", "Баклажан");
        System.out.println("car.toString() = " + car.toString());
        System.out.println("car1.toString() = " + car1.toString());
        System.out.println("car.getPrice() == car1.getPrice() = " + (car.getPrice() == car1.getPrice()));
    }
}
