import java.util.Random;

public class Zadanie16 {
    public static void main(String[] args) {

        int[] tab1 = new int[10];
        boolean[] tab2 = new boolean[10];

        Random randomBoolean = new Random();

        for( int i = 0; i < tab1.length; i++ ){
            tab1[i] = randomBoolean.nextInt(2);
        }

        for( int i = 0; i < tab1.length/2 ; i++){

            if ( tab1[i] == tab1[tab1.length-i-1]){
                tab2[i] = true;
                tab2[tab1.length-i-1] = true;
            }else {
                tab2[i] = false;
                tab2[tab1.length-i-1] = false;
            }


        }

        for ( boolean b: tab2
             ) {
            System.out.print(b+" ");
        }


    }
}
