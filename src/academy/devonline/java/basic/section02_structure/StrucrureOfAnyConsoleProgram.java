package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

public class StrucrureOfAnyConsoleProgram {
    public static void main(String[] args) {


        System.out.println("Please enter the number");
        var number = new Scanner(System.in) .nextInt();

        var result = number + 1;
        System.out.println(result);
    }
}
