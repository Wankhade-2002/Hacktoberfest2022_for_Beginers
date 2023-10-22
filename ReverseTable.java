import java.util.Scanner;
public class dumm {
    public static void main(String[] args) {
       System.out.println("enter the number for reversse multiplication");
       Scanner a = new Scanner(System.in);
       int b = a.nextInt();
       for(int i=10; i>0; i--){
            int result = b * i;
            System.out.println("the  reverse multiplication of " + b + " X" + i + " = " + result); 
       }
    }
}
