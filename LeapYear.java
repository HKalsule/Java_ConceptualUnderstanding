import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = sc.nextInt();
        if(year%4 == 0){
            System.out.println("Year is a leap year !!");
        }
        else if((year%4==0) && (year%100 == 0) && (year%400 ==0)){
            System.out.println("Year is a leap year !!");
        }
        else{
            System.out.println("Year is not a leap year :( ");
        }

    }
    
}
