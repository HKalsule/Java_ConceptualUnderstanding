package com.company;

import java.util.Scanner;

public class PracticeProblem {
    public static void main(String[] args){

    // Sum of First n Even Integers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many even numbers to sum : ");
        int n = sc.nextInt();
        int i = 0;
        int Sum = 0;

        while(i<n){
            Sum =  Sum + (2*i); 
            i++;
        }
        System.out.print("Sum of first " + n +  " even integers is : " + Sum );
        }

    // Multiplication Table 
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You Want To Print Table of : ");
        int n = sc.nextInt();
        for(int i=0 ; i<=10 ;i++){
            System.out.println(i + " x " + n + " is " + (i*n) );
        }

    // Factorial Of a Number
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You Want To Find Factorial Of : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=0 ; i<n ;i++){
            fact = fact * (n-i);
        }
        System.out.println("Factorial of "+ n + " is " + fact + "." );
        }
}
