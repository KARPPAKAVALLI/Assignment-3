package assignment3;

import java.util.Scanner;

public class MultiplicationTable {
    //3. Write a program to print multiplication table of a given number in a neat format
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int x=sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x+" x "+i+" = "+(x*i));
        }
    }
}
