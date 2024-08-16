package academy.devonline.java.basic.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson10 {
    public static void main(String[] args) throws IOException {
/*        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("inner " + j);
            }
            System.out.println("text " + i);
        }*/

/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        while (!str.equals("exit")) {
            System.out.println(str);
            str = reader.readLine();
        }*/

        for(int i = 2; i <= 100; i+=2){
            System.out.println(i);
        }

/*        int i = 10;
        while (i >= 1){
            System.out.println(i);
            i--;
        }*/

/*        int j = 0;
        do{
            System.out.println("text " + j);
            j++;
        } while (j < 10);*/

    }
}