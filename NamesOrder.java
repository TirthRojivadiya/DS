import java.util.Scanner;
public class NamesOrder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter total number of names to enter");
        int size = sc.nextInt();

        String[] names = new String[size];

        String name = names[0];

        for(int i = 0;i<size;i++){
        if()
            String temp = name;
            name = names[i];
            names[i] = temp;
           }

        }
        for(int i =0;i<size;i++){
            System.err.println(names[i]);
        }

    }
}