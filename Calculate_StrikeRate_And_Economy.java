import java.util.Scanner;

public class Calculate_StrikeRate_And_Economy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("To Find Strike rate Of The Batsman :-");
        System.out.print("Balls Played : ");
        float balls;
        balls = sc.nextFloat();

        System.out.print("Runs Scored : ");
        float runs;
        runs = sc.nextFloat();

        float strikeRate = runs * 100 / balls;
        System.out.println("Strike rate : " + strikeRate);


        System.out.println("To Find Economy of The Bowler :-");
        System.out.print("Balls Bowled: ");
        float balls1;
        balls1 = sc.nextFloat();

        System.out.print("Runs Conceded: ");
        float runs1;
        runs1 = sc.nextFloat();

        float economy = runs1*6/balls1;
        System.out.println("Economy : " + economy);
    }
}
