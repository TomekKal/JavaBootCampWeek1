import java.util.Random;

public class Zadanie9 {
    public static void main(String[] args) {

        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        int j = 0;

        Random randomNumber = new Random();

        for ( int i = 0; i < tab1.length; i++){

            tab1[i]=randomNumber.nextInt(101);
            System.out.print(tab1[i]+" ");
        }

        System.out.println();

        for ( int i = tab1.length; i > 0; i--){

            tab2[i-1] = tab1[j];
            j++;
        }

        for (int item : tab2){
            System.out.print(item+" ");
        }
    }
}
