import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        // for(int i=n;i>=1;i--){ -----> alternate way
        //     fact=fact*i;
        // }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        sc.close();
        System.out.println(fact);
    }
}
