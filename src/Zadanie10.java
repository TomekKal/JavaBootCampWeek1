import java.util.Random;

public class Zadanie10 {
    public static void main(String[] args) {

        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        int[] tab12 = new int[tab1.length+ tab2.length];

        Random randomNumber = new Random();

        for ( int i = 0; i < tab2.length; i++){

            tab1[i] = randomNumber.nextInt(101);
            tab12[i] = tab1[i];

            tab2[i] = randomNumber.nextInt(101);
            tab12[i+ tab1.length] = tab2[i];
        }

        System.out.println("\n\nTablica 1");

        for (int item : tab1) {
            System.out.print(item + " ");
        }

        System.out.println("\n\nTablica 2");

        for (int item : tab2) {
            System.out.print(item + " ");
        }

        System.out.println("\n\nTablica 1+2");

        for (int item : tab12) {
            System.out.print(item + " ");
        }

    }
}
