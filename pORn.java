import java.util.Scanner;
public class pORn {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }
        sc.close();

    }
}
