

import java.util.Scanner;


public class Seconds{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter seconds");
        int seconds = scan.nextInt();

        int hour= seconds/3600;
        seconds = seconds-(3600*hour);
        int minute = seconds/60;
        seconds = seconds-(60*minute);
        System.out.println(hour +":" + minute +":"+seconds);

    }
}