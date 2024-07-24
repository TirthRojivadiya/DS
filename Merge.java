
import java.util.Scanner;




public class Merge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array 1");
       int size1 = sc.nextInt();

        int[] a = new int[size1];
        System.out.println("enter array element");

        for(int i =0;i<size1;i++){
           a[i] = sc.nextInt();
        }
        System.out.println("enter the size of array 2");
         int size2 = sc.nextInt();
          int[] b= new int[size2];
        System.out.println("enter array element");
        for (int j = 0; j < size2; j++) {
            b[j] = sc.nextInt();
            
        }
        int[]c = new int[a.length + b.length];

        for(int i=0;i<a.length;i++){
            c[i] = a[i]+b[i];
             
        }
        for(int j=0;j<b.length;j++){
            c[j+a.length]=b[j];
        }
        
    }




    }

