// multiply two numbers and return the product

import java.util.Scanner;

public class mult {
    public static int Product(int a, int b){
        int product=a*b;
        return product;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENETR THE NUMBER A");
        int a=sc.nextInt();
        System.out.println("ENETR THE NUMBER B");
        int b=sc.nextInt();
        int product=Product(a, b);
        System.out.println("THE PRODUCT OF TWO NUMBERS NIS:"+product);
    }
    
}
