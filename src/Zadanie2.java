import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {


        int[] tab = new int[100];

        // uzupełnianie losowymi

        for( int i = 0; i< tab.length; i++) {
            Random losowa = new Random();
            // generuje integery z przedziału od 0 do 14  liczba 15 jest wyłączona
           tab[i] = losowa.nextInt(15);

           /* int randomNumber = losowa.nextInt(21) - 10;
            int randomNumber = losowa.nextInt(1001);
            tab[i] = randomNumber; */
        }

        for(int element : tab ) {
            System.out.println(element);
        }

    }
}
