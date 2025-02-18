package ua.nure;

public class App {
    public static void main(String[] args) {
        Example example = new Example();
        example.method();
        System.out.println("instanceVar: " + example.instanceVar);
        System.out.println("staticVar: " + example.staticVar);
        System.out.println("staticVar: " + Example.staticVar);
        System.out.println("staticFinalVar: " + Example.staticFinalVar);
        System.out.println("example: " + example);
    }
}
