package ru.itsjava.interfacesPractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat implements Walkable, Swimable, Runnable, Flyable{
    private final String name;
    private int maxRunDistance;

    @Override
    public void fly() {
        System.out.println(name + " не умеет летать!");
    }

    @Override
    public String flyMaxDistance() {
        return "Не умеет летать";
    }

    @Override
    public void run() {
        System.out.println(name + " умеет бегать.");
    }

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public void swim() {
        System.out.println(name + " не умеет плавать!");
    }

    @Override
    public double maxSwimSpeed() {
        return 0.0;
    }

    @Override
    public void walk() {
        System.out.println(name + " неспешно прогуливается.");
    }
}
