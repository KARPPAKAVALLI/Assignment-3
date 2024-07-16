package assignment3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score");
        //double -> since, marks can be in double
        double grade=sc.nextDouble();
        System.out.print("The Grade is : ");
        if(grade>=90)
            System.out.println("A");
        else if (grade>=80)
            System.out.println("B");
        else if(grade>=70)
            System.out.println("C");
        else if(grade>=60)
            System.out.println("D");
        else if(grade>=50)
            System.out.println("E");
        else
            System.out.println("F");
    }
}
