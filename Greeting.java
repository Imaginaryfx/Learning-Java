import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Name ?");
        String name = sc.next();

        System.out.println("Hello " + name + " Have A Great Day Today!");
    }
}
