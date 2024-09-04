 import java.util.Scanner;
 public class incometaxcalc{
    public static void main(String[]args){
        System.out.println("Enter your income:");
        Scanner sc = new Scanner(System.in);
        int income=sc.nextInt();
        double tax;
        if(income<=250000){
            tax=0;
            System.out.println("your tax will be:" + (income*tax));
        }
        else if(income>250000 && income<=500000){
            tax=0.1;
            System.out.println("Your tax will be:" +(income*tax));

        }
        else if(income>500000 && income<=1000000){
            tax=0.2;
            System.out.println("Your tax will be:" + (income*tax));
        }
        else{
            tax=0.3;
            System.out.println("Your tax will be:" + (income*tax));
           
        }
        sc.close();
    }
 }
