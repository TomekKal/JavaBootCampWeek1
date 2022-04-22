import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {


        try {
            Scanner o = new Scanner(System.in);
            int howHigh;
            char sing;

            System.out.println("\nNarysuję Ci choinkę.");
            System.out.println("Podaj wysokość choinki: ");
            howHigh = o.nextInt();
            o.close();

            for (int i = 1; i <= howHigh; i++){
                for (int j = 1; j < 2*howHigh; j++){

                    if( j <= (howHigh-i) || j >= (howHigh+i) ) {
                        sing = ' ';
                    }else sing = '*';

                    System.out.print(sing);
                }
                System.out.println();

            }


            System.out.println("\nNarysowana choinka ma "+howHigh+"m");

        }catch(Exception e) {
            System.out.println("Musisz wpisać cyfrę.");
        }


    }
}
