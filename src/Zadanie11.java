import java.util.Random;

public class Zadanie11 {
    public static void main(String[] args) {

        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        int[] sum = new int[10];

        Random randomNumber = new Random();

        for ( int i = 0; i< tab1.length; i++){

            tab1[i] = randomNumber.nextInt(101);
            System.out.print(tab1[i]+" ");

            tab2[i] = randomNumber.nextInt(101);
            System.out.print(tab2[i]+" ");

            sum[i] = tab1[i] + tab2[i];
            System.out.print(sum[i]+" \n");
        }
    }
}
