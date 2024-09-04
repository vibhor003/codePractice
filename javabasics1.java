import java.util.*;
public class javabasics1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n<=12){
            System.out.println("Child");
        }
        else if (n>12 && n<18){
            System.out.println("Teanager");
        }
        else if (n>100){
            System.out.println("dead");
        }
        else {
            System.out.println("Adult");
        }
        sc.close();
    }
    
}
