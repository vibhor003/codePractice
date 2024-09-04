import java.util.Scanner;

public class binomialCoeficient {
    public static int factorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
             factorial=factorial*i;
            }
            return factorial;
    }
    public static int binCoeff(int n,int r){
        int nFact=factorial(n);
        int rFact=factorial(r);
        int nMrFact=factorial(n-r);

        int binomialCoeficient=nFact/(rFact*nMrFact);
        return binomialCoeficient;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        System.out.print("Enter r: ");
        int r=sc.nextInt();
       System.out.println(binCoeff(n,r));
       



        sc.close();
        

    }
}
