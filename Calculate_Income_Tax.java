import java.util.Scanner;

public class Calculate_Income_Tax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Income : Rs. ");
        long income = sc.nextLong();

        if (income>1000000){
            System.out.println("You Have To Pay Rs. " + income*30/100 + " Tax.");
        }
        else if (income>500000) {
            System.out.println("You Have To Pay Rs. " + income*20/100 + " Tax.");
        }
        else if (income>250000) {
            System.out.println("You Have To Pay Rs. " + income*5/100 + " Tax.");
        }
        else {
            System.out.println("You Have To Pay RS. 0 Tax.");
        }
    }
}
