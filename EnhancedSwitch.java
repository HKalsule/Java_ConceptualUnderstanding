import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age Dude : ");
        int age = sc.nextInt();
        
        switch(age){
            case 18 -> System.out.println("Lets goo dude you are a adult now!!");

            case 25 -> System.out.println("Dude its time to get a job!!");

            case 35 -> System.out.println("Lets go dude its your marriage age");

            case 50 -> System.out.println("Its time to retire now!!");

            default -> System.out.println("Enjoy your Zindagi Yaar!!");
        }
    }
}
