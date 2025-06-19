package com.company;
import java.util.Scanner;

public class FactorialRecursion {
    static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            int result;
            result = a * factorial(a-1);
            return result;
        }
    }
    static int factoriall(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            int resultt = 1;
            for(int i=1 ; i<=a ; i++){
                resultt *= i;
            }
            return resultt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number You Want To Find Factorial Of : ");
        int a = sc.nextInt();

        System.out.println("Factorial of " + a + " is " + factorial(a)); 
        System.out.println("Factorial of " + a + " is " + factoriall(a)); 
    }
}
