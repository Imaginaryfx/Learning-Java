import java.util.Scanner;

public class Have_You_Passed_Your_Exam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks Below :-");

        float marks1,marks2,marks3;
        int outOf1,outOf2,outOf3;

        System.out.print("1st Subject : ");
        marks1 = sc.nextFloat();
        System.out.print("Out Of - ");
        outOf1 = sc.nextInt();

        System.out.print("2nd Subject : ");
        marks2 = sc.nextFloat();
        System.out.print("Out Of - ");
        outOf2 = sc.nextInt();

        System.out.print("3rd Subject : ");
        marks3 = sc.nextFloat();
        System.out.print("Out Of - ");
        outOf3 = sc.nextInt();

        float sub1percentage = marks1*100/outOf1;
        float sub2percentage = marks2*100/outOf2;
        float sub3percentage = marks3*100/outOf3;

        float totalPercentage = (marks1 + marks2 + marks3)*100/(outOf1 + outOf2 + outOf3);

        System.out.println("Your total Percentage = " + totalPercentage + " %");

        if (totalPercentage>40 && sub1percentage>=33 && sub2percentage>=33 && sub3percentage>=33) {
            System.out.println("You Are Pass!");
        }
        else {
            System.out.println("You Are Fail!");
        }
    }
}
