import java.util.*;
public class binToDec {
    public static int binToDecConverter(int binNo){
        int pow=0;
        int decNo=0;
        while(binNo>0){
            int ld=binNo%10;
            decNo=decNo+(ld * (int)Math.pow(2,pow));
            binNo=binNo/10;
            pow++;
            
        }
        return decNo;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int binNo=sc.nextInt();
        System.out.println("The decimal equivalent is : "+binToDecConverter(binNo));
        sc.close();
        
    }
}
