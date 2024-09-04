
import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter operator:");
        int operator=sc.next().charAt(0);
        System.out.println("Enter B:");
        int b=sc.nextInt();
        switch(operator){
                case '+' :System.out.println("The result is :" + (a+b));
                break;
                case '-' :System.out.println("The result is :"+ (a-b));
                break;
                case '*' :System.out.println("The result is :" + (a*b));
                break;
                case '/' :System.out.println("The result is :" + (a/b));
                break;
                case '%' :System.out.println("The result is :" + (a%b));
                break;
        }
            sc.close();

    }
    
}