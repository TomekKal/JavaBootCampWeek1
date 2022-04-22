import java.util.Random;

public class Zadanie15 {
    public static void main(String[] args) {

        int[] tab = new int[10000];
        int[] count = new int[13];
        int max = 0;

        Random randomNumber = new Random();

        for( int i = 0; i < tab.length; i++ ){
            tab[i] = randomNumber.nextInt(6) + randomNumber.nextInt(6) + 2;
        }

        for( int i = 0; i < tab.length; i++ ){
            count[tab[i]] = count[tab[i]]+1;
        }

        System.out.println("Ile razy wypadła wartość: ");

        for( int j : count
             ) {
            System.out.print( j + " " );
        }

        for( int i = 0; i < count.length; i++){
            if( max < count[i])
                max = count[i];

        }

        System.out.println("\nMaksymalna liczba powtórzeń: "+max);

    }
}
