import java.util.Scanner;

public class DeleteNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter a value of array at index " + i + " : ");
            array[i] = sc.nextInt();
        }
        System.out.print("enter a index to insert : ");
        int index = sc.nextInt();
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < size - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}