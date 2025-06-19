package com.company;

public class VariableArguments {

    // VarArg Below
    static int sum(int a,int ...arr){
        int result=a;
        for(int i=0 ; i<arr.length ; i++){
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        /* The Below statement throws an error because
        one argument in necessary above. For this to 
        run you need to remove "int a" above in 
        th method. */

        // System.out.println("Sum is " + sum());

        System.out.println("Sum is " + sum(1));
        System.out.println("Sum is " + sum(1,2));
        System.out.println("Sum is " + sum(1,2,3,4,5,6,7,8,9,10));
    }
}
