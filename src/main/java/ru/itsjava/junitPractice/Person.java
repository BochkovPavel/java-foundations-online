package ru.itsjava.junitPractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private final String name;
    private int age;

    public void birthday() {
        this.age++;
    }

    public boolean takeBeer() {
        return age > 17 ? true : false;
    }
}
