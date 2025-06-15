public class Loops {
    public static void main(String[] args) {
        
        // While Loop
        int i = 0;
        System.out.println("Using While Loop : ");
        while(i<=10){
            System.out.println(i);
            i++;
        }

        // Do-While Loop
        int b = 0;
        System.out.println("Using Do While Loop : ");
        do { 
            System.out.println(b);
            b++;
        } while (b<=10);

        // For Loop
        System.out.println("Using For Loop : ");
        for(int a=0 ; a<=10 ; a++){
            System.out.println(a);
        }
    }
}

