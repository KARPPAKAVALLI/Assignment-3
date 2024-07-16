package assignment3;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a= sc.nextInt(), b=sc.nextInt(),c= sc.nextInt();
        System.out.print("The greatest number is: ");
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
        sc.close();
    }
}
