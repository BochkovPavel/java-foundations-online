package ru.itsjava.junitPracticeTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.junitPractice.Person;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Person должен: ")
public class PersonTest {
    public static final String DEFAULT_NAME = "Patric";
    public static final int DEFAULT_AGE = 30;

    @DisplayName(" корретно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertAll(() -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));
    }

    @DisplayName(" корректно увеличивать возраст в день рождения")
    @Test
    public void shouldHaveCorrectChangeBirthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.birthday();
        assertEquals(DEFAULT_AGE + 1, actualPerson.getAge());
    }
    @DisplayName(" корректно проверять позраст при продаже алкоголя")
    @Test
    public void shouldHaveCorrectCheckBirthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person newPerson = new Person(DEFAULT_NAME, 17);
        assertAll(() -> assertEquals(true, actualPerson.takeBeer()),
                () -> assertEquals(false, newPerson.takeBeer()));;
    }
}
