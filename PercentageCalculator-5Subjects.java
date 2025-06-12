package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter your Marks ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in first subject: ");
        float a = sc.nextFloat();
        System.out.println("Marks Entered for first subject are out of : ");
        float p = sc.nextFloat();
        System.out.println("Enter marks in second subject: ");
        float b = sc.nextFloat();
        System.out.println("Marks Entered for second subject are out of : ");
        float q = sc.nextFloat();
        System.out.println("Enter marks in third subject: ");
        float c = sc.nextFloat();
        System.out.println("Marks Entered for third subject are out of : ");
        float r = sc.nextFloat();
        System.out.println("Enter marks in fourth subject: ");
        float d = sc.nextFloat();
        System.out.println("Marks Entered for fourth subject are out of : ");
        float s = sc.nextFloat();
        System.out.println("Enter marks in fifth subject: ");
        float e = sc.nextFloat();
        System.out.println("Marks Entered for fifth subject are out of : ");
        float t = sc.nextFloat();
    
        float sum = a + b + c + d + e;
        float sum2 = p + q + r + s + t;
        float total = sum/sum2;
        float percentage = total*100;
        
        System.out.println("Total marks obtained in all subject is : " + sum);
        System.out.println("Total marks obtained are out of : " + sum2);

        System.out.println("Your Percentage is : " + percentage);
    }
}
