import java.util.Scanner;
public class InsertNumberInAscendingOrderedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter a value of array at index " + i + " : ");
            array[i] = sc.nextInt();
        }
        int i = 0;
        System.out.println("Enter a value to insert into array : ");
        int value = sc.nextInt();
        int[] ansarr = new int[size + 1];
        while (i < size && array[i] < value ) {
            ansarr[i] = array[i];
            i++;
        }
        ansarr[i] = value;
        for (i = i + 1; i < size + 1; i++) {
            ansarr[i] = array[i - 1];
        }
        for (i = 0; i < size + 1; i++) {
            System.out.print(ansarr[i] + " ");
        }
    }
}