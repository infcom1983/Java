package academy.devonline.java.basic.lesson4;

import academy.devonline.java.basic.lesson1.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(30, "Alex");
        System.out.println(user.toString());

        User user1 = new User(34, "Mike");
        System.out.println(user.toString());
    }
}
