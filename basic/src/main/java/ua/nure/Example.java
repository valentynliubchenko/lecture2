package ua.nure;

public class Example {
    public static int staticVar = 10;  // Класова змінна
    public int instanceVar = 20;        // Змінна екземпляра
    public static final int staticFinalVar = 13;  // Класова змінна

    public void method() {
        int localVar = 30;       // Локальна змінна
        System.out.println("localVar: " + localVar);
    }

    @Override
    public String toString() {
        return "Example{" +
                "instanceVar=" + instanceVar +
                '}';
    }
}
