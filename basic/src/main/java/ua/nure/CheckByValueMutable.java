package ua.nure;

public class CheckByValueMutable {

    public static void sendByValue(PersonImmutable p) {
        p.withName("New name");
        System.out.println("in method sendByValue" + p.getName());
    }

    public static void main(String[] args) {
        PersonImmutable person = new PersonImmutable("init name");
        sendByValue(person);
        System.out.println("after method: " + person.getName());
    }
}

