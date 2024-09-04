import java.util.Scanner;
public class doWhile {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("Enter the number: ");
            number=sc.nextInt();
            if(number%2==0){
                evenSum+=number;
            }
            else{
                oddSum+=number;
            }
            System.out.println("Do you wish to continue?");
            choice=sc.nextInt();
        }
        while(choice==1);
        System.out.println("Sum of even: "+ evenSum);
        System.out.println("Sum of odd: "+ oddSum);
        sc.close();
        }

    }
    
    

