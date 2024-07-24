import java.util.Scanner;

public class Lab_5_2{
 public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[][] matrix1 = new int[3][2];
        System.out.println("enter the element of matrix1");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                matrix1[i][j] = sc.nextInt();

            }


        }
         int[][] matrix2 = new int[2][3];
        System.out.println("enter the element of matrix2");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrix2[i][j] = sc.nextInt();
}
}
 int[][] matrix3 = new int[3][3];
        System.out.println("enter the element of matrix3");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for (int k = 0; k < 2; k++) {

                     matrix3[i][j] =matrix1[i][k] +matrix2[k][j];
}
                }
 }
 System.out.println("multiplication of two matrix");
  for(int i=0;i<3;i++){
     for(int j=0;j<3;j++){
 System.out.println("enter multiplication of two matrix ");
     }
     System.out.println();
  }
  sc.close();
}
}
 
