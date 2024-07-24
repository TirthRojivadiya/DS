import java.util.Scanner;


public class Days{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter days");
        int days = scan.nextInt();

        int year = days/365;
        days = days-(365*year);
        int month = days/30;
        month = month-(30*month);
        System.out.println(year +"year(s)" + month +"month(s)");
    }
}
