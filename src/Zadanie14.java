import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {

        int weight, height;
        double bmi;



        try {
            Scanner o = new Scanner(System.in);

            System.out.println("Podaj wysokość w [m] ");
            height = o.nextInt();

            System.out.println("Podaj wagę w [kg] ");
            weight = o.nextInt();
            o.close();

            System.out.println("\nMasz wzrostu: "+height+"m");
            System.out.println("Ważysz: "+weight+"kg");


            bmi = (double)weight/(height*height);
            System.out.println("\n Twoje BMI wynosi: "+bmi);


        }catch(Exception e) {
            System.out.println("\nMusisz wpisać cyfrę.");
        }

    }
}
