import java.util.Scanner;

public class Convert_Kilometers_To_Miles {
    public static void main(String[] args) {

        System.out.println("Convert Kilometers To Mile.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Distance In Kilometer : ");
        double km = sc.nextFloat();

        double converting = km/1.609344d;

        System.out.println("Distance In Mile : " +converting);
    }
}
