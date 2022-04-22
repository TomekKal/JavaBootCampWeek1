import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {

        try {
            Scanner o = new Scanner(System.in);

            int s, k, n, sum;
            sum = 0;

            System.out.println("Podaj pierwsza liczę ciągu arytmetycznego: ");
            s = o.nextInt();


            System.out.println("Podaj krok ciągu arytmetycznego: ");
            k = o.nextInt();


            System.out.println("Podaj ilość elementów ciągu arytmetycznego: ");
            n = o.nextInt();
            o.close();

            System.out.println("Wygenerowany ciąg arytmetyczny: \n");

            for (int i = 0; i < n; i++) {

                System.out.print(s + " ");
                sum = sum + s;
                s = s + k;
            }

            System.out.println("\nSuma ciągu: "+sum);

        }catch(Exception e) {
            System.out.println("Musisz wpisać cyfrę.");
        }
    }
}
