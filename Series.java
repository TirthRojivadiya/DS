mport java.util.Scanner;


public class Series{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number= scan.nextInt();

        int sum=0;

        for(int i = 1; i <=num;i++){
            int sum_f= 0;
            for(int j = 1; j<=i;j++){
                sum_f = sum_f + j;

            }
            sum = sum + sum_f;
        }
        System.out.println("Sum of Series:"+sum);
    }
}
