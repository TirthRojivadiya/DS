import java.util.Scanner;

public class InsertNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initialize the array
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length;
        
        // Display the original array
        System.out.print("Original Array: ");
        displayArray(arr);
        
        // Ask user for position and number to insert
        System.out.print("\nEnter the position where you want to insert: ");
        int pos = sc.nextInt();
        System.out.print("Enter the number to insert: ");
        int num = sc.nextInt();
        
        // Validate the position
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position!");
        } else {
            // Create a new array with increased size
            int[] newArr = new int[n + 1];
            
            // Copy elements to the new array
            for (int i = 0, j = 0; i < n + 1; i++) {
                if (i == pos - 1) {
                    newArr[i] = num;
                } else {
                    newArr[i] = arr[j];
                    j++;
                }
            }
            
            // Display the modified array
            System.out.print("Array after insertion: ");
            displayArray(newArr);
        }
        
        sc.close();
    }
    
    // Method to display the elements of an array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
