package academy.devonline.java.basic.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age");

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int a = 5;
        int b = a - num1;
        int c = a - num2;

        if(b > c){
            System.out.println(b);
        }


/*        if (age >=  18 || age <= 10){
            System.out.println("Adult Content");
        } else {
            System.out.println("No Content");
        }*/

//        if(num1 > num2 && num1 < num3){
//            System.out.println(num1);
//        } else if(num2 > num1 && num2 < num3 ){
//            System.out.println(num2);
//        } else if(num3 > num1 && num3 < num2){
//            System.out.println(num3);
//        }


    }
}
