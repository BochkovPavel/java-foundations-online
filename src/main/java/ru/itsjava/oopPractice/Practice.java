package ru.itsjava.oopPractice;

import ru.itsjava.oopPractice.Birds.Crow;
import ru.itsjava.oopPractice.Transport.Bus;

public class Practice {
    public static void main(String[] args) {
        Crow crow = new Crow("Voron", true, false, 3);
        Crow crow2 = new Crow("Voron2", true, false, 3);
        System.out.println("crow.toString() = " + crow.toString());
        System.out.println("crow.hashCode() = " + crow.hashCode());
        System.out.println("crow2.hashCode() = " + crow2.hashCode());
        System.out.println("crow.equals(crow2) = " + crow.equals(crow2));
        Bus bus = new Bus("zil 4567", "76r", 349);
        System.out.println("bus.toString() = " + bus.toString());
    }
}
