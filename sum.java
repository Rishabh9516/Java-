import java.util.Scanner;

public class sum {
    public static int CalculateSum(int a ,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number a");
        int a=sc.nextInt();
        
        System.out.println("enter the number b");
        int b=sc.nextInt();
        
        int sum=CalculateSum(a, b);
        System.out.println("the sum of two no is" +sum );
    }
    
}
