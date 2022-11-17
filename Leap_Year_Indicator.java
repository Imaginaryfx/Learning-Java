import java.util.Scanner;

public class Leap_Year_Indicator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year;
        year = sc.nextInt();

        if (year<1752) {
            System.out.println("Please Enter Year More Than 1752,\nBecause 1752 Was The First Leap Year In The Modern Sense In Britain.");
        }
        if (year%4==0) {
            System.out.println(year + " - A Leap Year.");
        }
        else {
            System.out.println(year + " - Not A Leap Year.");
        }
    }
}
