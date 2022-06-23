package ru.itsjava.comparableClonePractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Cloneable, Comparable {
    private final String name;
    private final String surname;
    private int age;


    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        if (!this.name.equals(person.getName())) {
            return this.name.compareTo(person.getName());
        }
        if (!this.surname.equals(person.getSurname())) {
            return this.name.compareTo(person.getName());
        }
        if (this.age != person.getAge()) {
            if (this.age - person.age > 0) {
                return 1;
            }
            if (this.age - person.age < 0) {
                return -1;
            }
        }
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
