import java.util.Random;

public class Zadanie8 {
    public static void main(String[] args) {

        int[] tab = new int[100];

        for( int i = 0; i < 100; i++){
            System.out.print(i+" ");

           if ( i > 0 ) {
               if (i % 3 == 0)
                   System.out.print("Fizz ");
               if (i % 5 == 0)
                   System.out.print("Buzz ");
           }

           System.out.println("\n");
        }


    }
}
