import java.util.Random;

public class Zadanie5 {

    public static void main(String[] args) {

        int[] tab = new int[10];
        int bigger;
        Random randomNumber = new Random();
       tab[0] = randomNumber.nextInt(101);
        System.out.println(tab[0]);

        for(int i = 1; i < tab.length; i++){

            do {
                bigger = randomNumber.nextInt(101);
            } while (tab[i-1] > bigger);

            tab[i] = bigger;
            System.out.println(""+tab[i]);

        }


    }
}
