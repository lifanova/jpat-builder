package ru.lifanova.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonBuilder implements IPersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя должно быть указано!");
        }

        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Фамиля должна быть указана!");
        }

        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Укажите возраст от 0 до 100 лет");
        }

        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public Person build() throws IllegalStateException {
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException("Имя и фамилия обязательны для создания объекта Person");
        }

        return new Person(this);
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + address + '\'' +
                '}';
    }
}