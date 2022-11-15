import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Press (R) for Rock, (P) for Paper And (S) for Scissors.");
        System.out.print("Enter - ");
        String s1;
        s1 = sc.next();

        if (s1.equalsIgnoreCase("R") || s1.equalsIgnoreCase("P") || s1.equalsIgnoreCase("S")) {

            if (s1.equalsIgnoreCase("P")){
                System.out.println("You Chose - Paper");
            }
            if (s1.equalsIgnoreCase("R")){
                System.out.println("You Chose - Rock");
            }
            if (s1.equalsIgnoreCase("S")){
                System.out.println("You Chose - Scissors");
            }

            
            int rnd1 = rnd.nextInt(3)+1;

            if (rnd1 == 1){
                System.out.println("Computer - Paper");
            }
            else if (rnd1 == 2){
                System.out.println("Computer - Scissors");
            }
            else {
                System.out.println("Computer - Rock");
            }


            if (s1.equalsIgnoreCase("R") && rnd1 == 1) {
                System.out.println("You Lose! Try Again...");
            }
            else if (s1.equalsIgnoreCase("R") && rnd1 == 2) {
                System.out.println("Congratulations! You Won");
            }
            else if (s1.equalsIgnoreCase("R") && rnd1 == 3) {
                System.out.println("Match-Tied");
            }


            if (s1.equalsIgnoreCase("P") && rnd1 == 1) {
                System.out.println("Match-Tied");
            }
            else if (s1.equalsIgnoreCase("P") && rnd1 == 2) {
                System.out.println("You Lose! Try Again...");
            }
            else if (s1.equalsIgnoreCase("P") && rnd1 == 3) {
                System.out.println("Congratulations! You Won");
            }


            if (s1.equalsIgnoreCase("S") && rnd1 == 1) {
                System.out.println("Congratulations! You Won");
            }
            else if (s1.equalsIgnoreCase("S") && rnd1 == 2) {
                System.out.println("Match-Tied");
            }
            else if (s1.equalsIgnoreCase("S") && rnd1 == 3) {
                System.out.println("You Lose! Try Again...");
            }
        }
        else {
            System.out.println("ERROR - Please press (R), (P) or (S) Only!");
        }
    }
}
