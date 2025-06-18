package com.company;

public class Methods {

    // No Return Needed For Void
    static void Greet(){
        System.out.println("Hello!!");
    }

    // Return Is Needed For Other DataTypes
    static int Sum(int a,int b){
        int c;
        c = a + b;
        return c;
    }
    
    // Trying To Change The Value Of Integer
    static void change(int a){
        a = 10;
    }

    // Trying To Change The Value In A Array
    static void change2(int [] array){
        array[0] = 10;
    }
    
    public static void main(String[] args) {
    //1
        Greet();

    //2
        int a = 10;
        int b = 20;
        int Summ;
        Summ = Sum(a,b);
        System.out.println(Summ);
    
    //3
        int c = 20;
        change(c);
        System.out.println(c);

    //4
        int[] arr = {1,2,3,4,5};
        change2(arr);
        System.out.println(arr[0]);
    }
    
}
