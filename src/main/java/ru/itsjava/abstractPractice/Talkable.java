package ru.itsjava.abstractPractice;

public interface Talkable {
    default void talk() {
        System.out.println("Говорит");
    }
}
