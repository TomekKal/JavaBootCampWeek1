import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {

        try {
            Scanner o = new Scanner(System.in);

            int min, max, sum;
            int[] tab = new int[3];

            System.out.println("Podaj długość pierwszego boku trójkata: ");
            tab[0] = o.nextInt();

            System.out.println("Podaj długość drugiego boku trójkata: ");
            tab[1] = o.nextInt();

            System.out.println("Podaj długość trzeciego boku trójkata: ");
            tab[2] = o.nextInt();
            o.close();

            //Nierówność trójkąta – twierdzenie matematyczne mówiące,
            // że dla dowolnego trójkąta miara każdego boku musi być
            // mniejsza sumie miar dwóch pozostałych, ale większa od różnicy ich miar.

            min = tab[0];

            for( int i = 0; i < tab.length; i++){
                if (tab[i]<min)
                    min = tab[i];
            }

            max = tab[0];

            for( int i = 0; i < tab.length; i++){
                if (tab[i]>max)
                    max = tab[i];
            }

            sum = 0;

            for( int i = 0; i < tab.length; i++){
                sum = sum + tab[i];
            }


            if(max-min >= sum-max-min){
                System.out.println("\nZ powyższych odcinków nie ułożysz trójkata.");
            }else
                System.out.println("\nZ odcinków możesz ułożyć trójkąt.");


        }catch(Exception e) {
            System.out.println("Musisz wpisać cyfrę.");
        }


    }
}
