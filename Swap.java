import  java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Swap2 sw = new Swap2();
        System.out.println("enter the value of a");
        sw.a = sc.nextInt();
        System.out.println("enter the value of b");
        sw.b = sc.nextInt();
        sw.SwapNumber();
         System.out.println("after swapping");
          System.out.println("value of a ="+sw.a);
           System.out.println("value of b ="+sw.b);

         


         



    }
}

  class Swap2{
    int a,b;
    public Swap2(){
        int temp = a;
        a = b;
        b = temp;
    }
}