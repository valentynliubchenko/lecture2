package ua.nure;

public class PersonImmutable {
    private String name;

    public PersonImmutable(String name) {
        this.name = name;
    }

    public PersonImmutable(PersonImmutable other) { // Конструктор копіювання
        this.name = other.name;
    }

    public String getName() {
        return name;
    }

    // Замість setName створюємо метод, що повертає новий об'єкт
    public Person withName(String newName) {
        return new Person(newName);
    }
}