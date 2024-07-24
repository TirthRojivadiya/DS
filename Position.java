import java.util.Scanner;

public class Position{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size= sc.nextInt();

        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter number at index");
            array[i] = sc.nextInt();
        }
        int small = array[0], large = array[0];

        for(int i =0;i<size;i++){
            if(array[i]>large){
                large = i;

            }
             if(array[i]<small){
                small = i;

            }

        }
        System.out.println("Smallest number is at position" +small+",");
        System.out.println("largest number is at position"+large);
    }
}