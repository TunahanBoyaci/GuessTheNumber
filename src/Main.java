import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Number has been created!");
        int number = random.nextInt(100);
        int attempts = 10;

        System.out.println("Try to guess the number!");

        while (true) {
            System.out.println("You have " + attempts + " attempts");
            int guess = scanner.nextInt();

            if (guess==number){
                System.out.println("Congrats! You won!");
                break;
            }
            else if (guess<number){
                System.out.println("Too Low!");
                attempts--;
            }
            else if (guess>number){
                System.out.println("Too High");
                attempts--;
            }

            if (attempts == 0){
                System.out.printf("Sorry, you lost!");
                break;
            }
        }
    }
}