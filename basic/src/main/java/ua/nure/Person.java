package ua.nure;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person other) { // Конструктор копіювання
        this.name = other.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}