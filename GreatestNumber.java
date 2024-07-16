package assignment3;

import java.util.Scanner;

public class GreatestNumber {
    //1. Take three numbers from the user and print the greatest number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a= sc.nextInt(), b=sc.nextInt(),c= sc.nextInt();
        System.out.print("The greatest number is: ");
        //assume max=a
        int max=a;
        //if b>a then, assign b to a
        if(b>max){
            max=b;
        }
        //if c>a, it implies c > b (curr value of a) which is in turn > a
        if(c>max){
            max=c;
        }
        System.out.println(max);
        sc.close();
    }
}
