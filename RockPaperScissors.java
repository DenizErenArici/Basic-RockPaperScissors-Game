import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int max = 3;
        int min = 1;
        int computerChoice = (short) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Please enter your move");
        int usersChoice = input.nextShort();
        while (usersChoice < min || usersChoice > max) {
            System.out.println("Invalid entry,please enter again");
            usersChoice = input.nextShort();
        }
        switch (usersChoice) {
            case 1:
                if (computerChoice == 2) {
                    System.out.println("You lose!");
                }
                if (computerChoice == 3) {
                    System.out.println("You win!");
                }
                if (computerChoice == 1) {
                    System.out.println("It's draw!");
                }
                break;
            case 2:
                if (computerChoice == 3) {
                    System.out.println("You lose!");
                }
                if (computerChoice == 2) {
                    System.out.println("It's draw!");
                }
                if (computerChoice == 1) {
                    System.out.println("You win!");
                }
                break;
            case 3:
                if (computerChoice == 3) {
                    System.out.println("It's draw!");
                }
                if (computerChoice == 2) {
                    System.out.println("You win!");
                }
                if (computerChoice == 1) {
                    System.out.println("You lose!");
                }
                break;
        }
    }
}