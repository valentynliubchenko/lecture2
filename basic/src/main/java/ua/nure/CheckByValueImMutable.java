package ua.nure;

public class CheckByValueImMutable {

    public static void sendByValue(Person p) {
        p.setName("New name");
        System.out.println("in method sendByValue" + p.getName());
    }

    public static void main(String[] args) {
        Person person = new Person("init name");
        sendByValue(person);
        System.out.println("after method: " + person.getName());
    }
}

