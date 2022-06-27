package ru.itsjava.abstractPractice;

public interface Eatable {
   default void eat(){
       System.out.println("Ест");
   }
}
