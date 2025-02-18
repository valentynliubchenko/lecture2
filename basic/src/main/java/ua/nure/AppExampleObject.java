package ua.nure;

public class AppExampleObject {
    public static void main(String[] args) {
        ExampleObject exampleObject = new ExampleObject(10);
        System.out.println(exampleObject);
        System.out.println(exampleObject.toString());
        System.out.println(Integer.toHexString(exampleObject.hashCode()));
        System.out.println(exampleObject.getClass());
    }
}
