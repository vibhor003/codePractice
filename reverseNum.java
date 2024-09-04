import java.util.Scanner;
class reverseNum{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int rev=0;
        while(n>0){
            int lD=n%10;
            rev=rev*10+lD;
            // System.out.print(lD);
            n=n/10;
            
        }
        
        System.out.print(rev);
        
        sc.close();
    }
}