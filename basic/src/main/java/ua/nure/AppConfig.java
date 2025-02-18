package ua.nure;

public class AppConfig {
    public static void main(String[] args) {
        System.out.println("MAX_USERS: "+ Config.MAX_USERS);
        Config.MAX_USERS = 123;
        System.out.println("MAX_USERS: "+ Config.MAX_USERS);
    }
}
