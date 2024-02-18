package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Person person = new Person("Рита", "Иванова", 5, Sex.WOMAN, Education.ELEMENTARY);
        assertEquals("Рита", person.getName());
    }

    @org.junit.jupiter.api.Test
    void getFamily() {
        Person person = new Person("Ира", "Петрова", 7, Sex.WOMAN, Education.ELEMENTARY);
        assertEquals("Петрова", person.getFamily());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        Person person = new Person("Жанна", "Петрова", 19, Sex.WOMAN, Education.ELEMENTARY);
        assertEquals(19, person.getAge());
    }
}