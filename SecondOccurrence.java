package assignment3;

import java.util.Scanner;

public class SecondOccurrence {
    //4. Write a program to find second occurrence of a given number in an array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to find it's second occurrence: ");
        int x= sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
                if(count==2){
                    System.out.println("The 2nd occurrence of the given number is at index: "+count);
                    break;
                }
            }
        }
        if(count<2){
            System.out.println("There is no 2nd occurrence for the given number.");
        }
    }
}
