import java.util.Scanner;

public class Marks_Regards {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");

        int marks;
        marks = sc.nextInt();

        if (marks>100) {
            System.out.println("Please Enter Your Marks Out Of 100 Only.");
        }
        else if (marks>90) {
            System.out.println("Your Marks are Excellent!");
        }
        else if (marks>80) {
            System.out.println("Your Marks Are Very Good!");
        }
        else if (marks>70) {
            System.out.println("Your Marks Are Good!");
        }
        else if (marks>40) {
            System.out.println("Your Marks Are Average!");
        }
        else if (marks>20) {
            System.out.println("Your Marks Are Poor!");
        }
        else if (marks>10) {
            System.out.println("Your Marks Are Very Poor!");
        }
        else {
            System.out.println("Your marks Are Extremely Poor!");
        }

        switch (marks) {
            case 0 -> System.out.println("Are You Dumb!");
            case 100 -> System.out.println("You Got Full Marks! Congratulations!!!");
        }
    }
}
