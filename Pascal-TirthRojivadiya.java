import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        
        // Iterate through each row
        for (int i = 0; i < numRows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Initialize first element of each row
            int number = 1;
            // Print numbers in each row
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                // Calculate next number using the current number
                number = number * (i - j) / (j + 1);
            }
            
            // Move to the next line for the next row
            System.out.println();
        }
        
        scanner.close();
    }
}
