package com.company;

public class StringMethods {
    public static void main(String[] args){
    String name = "Hardik";

        int length = name.length();
        String lower = name.toLowerCase();
        String upper = name.toUpperCase();

        String nontrimmed = "   Hardik    ";
        String trimed = nontrimmed.trim();
        System.out.println(length);
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(trimed);  

        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace("r","ier"));
        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("k"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("rd"));
    }

}
