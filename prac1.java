// average of three numbers:
import java.util.Scanner;

public class prac1 {
    public static int CalculateAverage(int a,int b,int c){
        int average=(a+b+c)/3;
        return average;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENETR THE NUMBER A");
    int a=sc.nextInt();
     System.out.println("ENETR THE NUMBER B");
     int b=sc.nextInt();
 System.out.println("ENETR THE NUMBER C");
  int c=sc.nextInt();
  
int average=CalculateAverage(a, b, c);
System.out.println("THE AVERAGE OF THREE NUMBERS IS" +" " + average);


    }
    
    
}
