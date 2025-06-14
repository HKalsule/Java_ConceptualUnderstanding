import java.util.Scanner;
public class IfElsePracticeProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you marks in Subject 1 : ");
        float marks1 = sc.nextFloat();
        System.out.println("These are marks out of : ");
        float outof1 = sc.nextFloat();

        System.out.println("Enter you marks in Subject 2 : ");
        float marks2 = sc.nextFloat();
        System.out.println("These are marks out of : ");
        float outof2 = sc.nextFloat();
        
        System.out.println("Enter you marks in Subject 3 : ");
        float marks3 = sc.nextFloat();
        System.out.println("These are marks out of : ");
        float outof3 = sc.nextFloat();
        
        float sum = (marks1 + marks2 + marks3)/(outof1 + outof2 + outof3); 
        float average = sum*100;  
        System.out.print("Your overall percentage is : ");
        System.out.println(average);

        float ind1 = (marks1/outof1)*100;
        float ind2 = (marks2/outof2)*100;
        float ind3 = (marks3/outof3)*100;

        if(average>=44 && ind1>=33  && ind2>=33 && ind3>=33){
            System.out.println("Congrats! You are passed!! ");
        }
        else{
            System.out.println("Please Study and try again :) ");
        }
    }
}
