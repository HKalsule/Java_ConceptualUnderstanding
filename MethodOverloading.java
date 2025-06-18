package com.company;

public class MethodOverloading {

/*
Method Overloading in Java is the ability 
to define multiple methods with the same name 
in the same class, but with different parameters.
*/

    //1
    static void hell(){
        System.out.println("Hello!! Brother!!");
    }

    //2
    static void hell(int a){
        System.out.println("Hello!! "+a+" Brother!!");
    }
    
    //3
    static int hell(int a, int b){
        System.out.println("Hello!! "+a+" Brother!!");
        System.out.println("Hello!! "+b+" Brother!!");
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("When Case 1 is Called : ");
        hell();
        System.out.println();

        System.out.println("When Case 2 is Called : ");
        hell(10);
        System.out.println();

        System.out.println("When Case 3 is Called : ");
        hell(20,30);
        System.out.println();
    }
}
