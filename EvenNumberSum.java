package assignment3;

import java.util.Scanner;

public class EvenNumberSum {
    //6. Write a program to find the sum of even numbers only in a given array. Use continue.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            if(arr[i]%2!=0)
                continue;
            sum+=arr[i];
        }
        System.out.println("The sum of even numbers in the array is: "+sum);
    }
}
