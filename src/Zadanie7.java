import java.util.Random;

public class Zadanie7 {
    public static void main(String[] args) {

        int[] tab = new int[10];
        Random randomNumber = new Random();
        int reapeat = 0;

        for ( int i = 0; i < tab.length; i++){
            tab[i] = randomNumber.nextInt(11);
            System.out.print(" "+tab[i]);
            if (tab[i] == 5) {
                reapeat = reapeat + 1;
            }
        }
        System.out.println("\nIlość powtórzeń liczby 5: "+reapeat);

    }
}
