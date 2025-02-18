package ua.nure;

class ExampleStaticFinal {
    // Публічна статична фінальна константа (public - доступна з будь-якого місця)
    public static final double GRAVITY = 9.81;

    // Статичне поле з пакетом доступу (default - доступне тільки в межах пакету)
    static int objectCount = 0;

    // Приватне фінальне інстанційне поле (private - доступне тільки в межах цього класу, але не змінюється після ініціалізації)
    private final int id;

    // Конструктор для ініціалізації інстанційних полів
    public ExampleStaticFinal() {
        this.id = ++objectCount; // Унікальний ідентифікатор для кожного об'єкта
    }

    // Статичний метод для доступу до статичних полів (public доступ)
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // Використання статичної фінальної константи
    public static void displayGravity() {
        System.out.println("Gravitational constant: " + GRAVITY);
    }

    public static void main(String[] args) {
        // Створення об'єктів Example
        ExampleStaticFinal object1 = new ExampleStaticFinal();
        ExampleStaticFinal object2 = new ExampleStaticFinal();
        System.out.println("Gravitational constant: " + GRAVITY);
        // Використання статичного методу для відображення загальної кількості об'єктів
        ExampleStaticFinal.displayObjectCount();

        // Використання статичної фінальної константи
        ExampleStaticFinal.displayGravity();
    }
}