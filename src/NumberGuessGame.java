import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public void guessNumber() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(20) + 1;
        int attempts = 0;

        while (true) {
            System.out.println("Enter your Number: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Your guess is too high. Try again");
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low. Try again");
            } else {
                System.out.println("Congratulations. Your guess is correct!");
                System.out.println("It took you " + attempts + " attempts");
                break;
            }
        }
        scanner.close();
    }
}
