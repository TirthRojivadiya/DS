
import java.util.Scanner;

class StackDemo{  
    public static void main(String[] args) {
     
    }
      int n;
    int[] stack;
    int top; 
    

StackDemo(int n) {
    this.n = n;
    stack = new int[n];
    top = 0;
    }
    void push(int x){
        if(top>=n){
            System.out.println("Stack overflow");

    }
    else{
        top+=1;
        stack[top] = x;
    }
    
    


}
int pop(int x){
if(top==0){
    System.out.println("STACK UNDERFLOW");
    return -1;
}
else{
    top = top-1;
    return stack[top+1];
}
}


int peep(int i){
    if(top-i+1<=0){
        System.out.println("STACK UNDERFLOW");
        return -1;
    }
    else{
        return stack[top-i+1];
    }
}
  
void change(int i, int x){
    if(top-i+1<=0){
        System.out.println("STACK UNDERFLOW");
    }
    else{
        stack[top-i+1] = x;
        return;
    }
}
void dispaly(){
    if(top==0){
        System.out.println("stack is not exist");
    }
    else{
        for(int i =0;i<=top;i++){
            System.out.println("arr[i]");
        }
    }
}

public class StackMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of stack");
        int size = sc.nextInt();

        StackDemo stack = new StackDemo(3);
         System.out.println("push into stack");
          System.out.println("pop element from stack");
           System.out.println("peep element from stack");
            System.out.println("display stack");
             
            System.out.println("enter the operation to perform");
            int operation = sc.nextInt();
            boolean continueloop = true;


      

    }

}
}