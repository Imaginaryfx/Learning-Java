import java.util.Scanner;

public class Marks_Percentage {
    public static void main(String[] args) {

        System.out.println("Enter Your Marks Below");
        Scanner sc = new Scanner(System.in);

        System.out.print("Maths : ");
        float marks1 = sc.nextFloat();

        System.out.print("Physics : ");
        float marks2 = sc.nextFloat();

        System.out.print("Chemistry : ");
        float marks3 = sc.nextFloat();

        System.out.print("Hindi : ");
        float marks4 = sc.nextFloat();

        System.out.print("English : ");
        float marks5 = sc.nextFloat();

        float totalMarks = 500;
        float percent = 100;

        float percentage = (marks1 + marks2 + marks3 + marks4 + marks5)*percent/totalMarks;

        System.out.println("Your percentage : " + percentage + " %");

        float cgpa = (marks1+marks2+marks3+marks4+marks5)/50;
        System.out.print("Your CGPA : ");
        System.out.println(cgpa);
    }
}
