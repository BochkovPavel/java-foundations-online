package ru.itsjava.comparableClonePractice;

import java.util.Arrays;

public class ComClonePractice {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Pavel", "Bochkov", 38);
        Person p2 = new Person("Pavel", "Bochkov", 37);
        Person p3 = new Person("Pavel", "Bochkov", 39);
        Person p4 = new Person("Denis", "Bochkov", 39);
        Person p5 = new Person("Denis", "Ivanov", 15);
        Person p6 = (Person) p1.clone();
        Person[] arr = {p1,p2,p3,p4,p5,p6};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("p1 == p6 = " + (p1 == p6 ? true: false));
        System.out.println("p1.equals(p6) = " + p1.equals(p6));
    }
}
