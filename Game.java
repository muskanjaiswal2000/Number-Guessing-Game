import java.util.Random;
import java.util.Scanner;

 class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 5;
        int score = 100;  

        System.out.println("Welcome to Guess the Number!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound);

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                System.out.println("Your score is: " + score);
                break;
            } else {
                System.out.println("Wrong guess!");

                if (userGuess < targetNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }

                score -= 20;

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
                    System.out.println("Your final score is: " + score);
                }
            }
        }

        scanner.close();
    }
}
