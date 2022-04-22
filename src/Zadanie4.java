import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {

        int[][] tab = new int[10][5];
        Random random = new Random();

        // tab.length - wielkość jednego wymiaru
        // tab[0].lengthe - wielkośc drugiego wymiaru

        for(int i = 0; i < tab.length; i++ ) {
            for(int j = 0; j < tab[i].length; j++) {

                // bound: 101  liczby od (0 do 100 )
                tab[i][j] = random.nextInt(101);
            }
        }

        // tab to cała tabela dwuwymiarowa

        for(int[] row:tab) {

            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //wyświetlenie największej watości wiersza

        for(int[] row : tab) {
            int max = row[0];
            for(int i = 1; i < row.length; i++) {
                if(row[i] > max) {
                    max = row[i];
                }
            }
            System.out.println("Największa wartość " + max);
        }

    }
}
