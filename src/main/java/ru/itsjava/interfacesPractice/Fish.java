package ru.itsjava.interfacesPractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fish implements Walkable, Swimable, Runnable, Flyable{
    private final String name;

    private double maxSwimDistance;

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
        System.out.println(name + " не умеет ходить!");
    }

    @Override
    public int maxRunDistance() {
        return 0;
    }

    @Override
    public void swim() {
        System.out.println(name + " умеет плавать.");
    }

    @Override
    public double maxSwimSpeed() {
        return maxSwimDistance;
    }

    @Override
    public void walk() {
        System.out.println(name + " сплавляется по течению.");
    }
}
