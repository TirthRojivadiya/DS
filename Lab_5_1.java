
import java.util.Scanner;

public class Lab_5_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        System.out.println("enter the element of matrix1");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrix1[i][j] = sc.nextInt();

            }


        }
         int[][] matrix2 = new int[2][2];
        System.out.println("enter the element of matrix2");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrix2[i][j] = sc.nextInt();

            }


        }
         int[][] summatrix = new int[2][2];
        System.out.println("enter the sum of matrix");
        for(int i=0;i<2;i++){
             for(int j=0;j<2;j++){
                summatrix[i][j] =  matrix1[i][j] +  matrix2[i][j];
        }





    }
    System.out.println("sum of two matrix");
    for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
            System.out.println("enter the sum of matrix");
         }
         System.out.println();
    }
    sc.close();
}
}