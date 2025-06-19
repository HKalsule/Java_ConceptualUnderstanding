package com.company;
import java.util.Scanner;

public class FibbonacciSeries {
    static int fibonacci(int a){
        if(a==0){
            return 0;
        }
        if(a==1){
            return 1;
        }
        else{
            int result;
            result = fibonacci(a-1) + fibonacci(a-2);
            return result;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Upto Where You Want Series : ");
        int a = sc.nextInt();

        for(int i=0 ; i<a ; i++){
        System.out.print(fibonacci(i) + " ");
        }
    }
    }
