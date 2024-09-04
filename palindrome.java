import java.util.Scanner;
public class palindrome {
    public static void checkPalindrome(int n){
        int palindrome=0;
        int temp=n;
       while(temp>0){
        int ld=temp%10;
        palindrome=(palindrome*10)+ld;
        temp=temp/10;
       }
       if(n==palindrome){
        System.out.println("The given number is a Palindrome");
       }
       else{
        System.out.println("The given number is not a Palindrome");
       }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        checkPalindrome(n);
        sc.close();

        
    }
}
