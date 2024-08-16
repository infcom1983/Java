package academy.devonline.java.basic.lesson1;

import java.awt.*;

public class Main1 {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Mike", 33, 1000);
        System.out.println(robot1.getPower());

        Robot robot2 = new Robot("Lilu", 40, 1500);
        System.out.println(robot2.getPower());
    }
/*    if (robot1.getPower() > robot2.getPower()){
        System.out.println("1-й Робот победил");
    } else {
        System.out.println("2-й Робот победил");
    }*/

}
