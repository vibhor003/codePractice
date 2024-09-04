public class largestNum {
    public static void main(String[]args){
        int a=152942342;
        int b=102191731;
        int c=143238233;

        if(a>b && a>c){
            System.out.println("A is the largest");
        }
        else if (b>c){
            System.out.println("B is the largest");
        }
        else{
            System.out.println("C is the largest");
        }
    }
}
