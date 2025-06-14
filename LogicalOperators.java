public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("For Logical AND...");
        if(a && b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        System.out.println("For Logical OR...");
        if(a || b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.println("For Logical NOT...");
        System.out.print("The Value of NOT of a is ");
        System.out.println(!a);
        System.out.print("The Value of NOT of b is ");
        System.out.println(!b);

    }
}
    

