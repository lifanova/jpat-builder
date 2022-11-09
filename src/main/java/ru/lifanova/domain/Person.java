package ru.lifanova.domain;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;

    protected int age;
    protected String address;

    public Person (PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAge(0).setAddress(this.address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


    public boolean hasAge() {
        return this.age >= 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age++;
        }
    }

}
