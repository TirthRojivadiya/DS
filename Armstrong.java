public class Armstrong{

    public static void main(String[] args) {
        
        System.out.println("Armstrong numbers from 1 to 1000 are");
        for (int i = 0; i <= 1000; i++) {
            int num = i;
            int sum = 0;
            int rev = 0;
            while(num !=0){
                rev =num % 10;
                sum= sum + (rev*rev*rev);
                num = num/10;
            }
            if(sum == num){
                System.out.println(i +",");
            }
            
        }
    }
}