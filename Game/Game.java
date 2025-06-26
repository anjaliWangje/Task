package Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String user = sc.next();
        String computer = sc.next();

        System.out.println("You chose: " + user);
        System.out.println("Computer chose: " + computer);

        if (user.equals(computer)) {
        System.out.println("Result: Draw");
     }
        else if (user.equals("rock") && computer.equals("scissors")
            || user.equals("paper") && computer.equals("rock")
            || user.equals("scissors") && computer.equals("paper")) {
        System.out.println("Result: You win");
    } else {
        System.out.println("Result: You lose");
    }
}

}
