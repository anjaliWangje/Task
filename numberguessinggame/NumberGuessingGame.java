package numberguessinggame;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberGuess = 70;
        int userGuess = 80;

        if (userGuess < numberGuess) {
            System.out.println("Too low");
        } else if (userGuess > numberGuess) {
            System.out.println("Too high");
        } else {
            System.out.println("Correct");
        }
    }

}
class Gaming{
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int numberGuess = 70;

        System.out.print("Guess a number: ");
    int userGuess = sc.nextInt();

        if (userGuess < numberGuess) {
        System.out.println("Too low");
    } else if (userGuess > numberGuess) {
        System.out.println("Too high");
    } else {
        System.out.println("Correct");
    }

        sc.close();
}
}