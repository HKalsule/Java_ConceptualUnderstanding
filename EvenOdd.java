public class EvenOdd {
    public static void main(String[] args) {

        System.out.println("All Even Number In The Range Of 0-100 Are : ");
        for(int n=0 ; n<=50 ; n++){
            int i = 2*n;
            System.out.println(i);
        }

        System.out.println("All Odd Number In The Range Of 0-100 Are : ");
        for(int k=0 ; k<=49 ; k++){
            int j = 2*k + 1;
            System.out.println(j);
        }
    }
}

