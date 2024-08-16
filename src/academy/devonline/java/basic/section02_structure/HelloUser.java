package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Ваше имя?");
        var name = "Вася";

        var result = "Hello, " + name;
        System.out.println(result);

    }
}
