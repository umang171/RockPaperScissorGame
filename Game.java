import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int compScore = 0;
        int playScore = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("============ Round-" + (i + 1) + " =============");
            System.out.println("Enter 1 for rock");
            System.out.println("Enter 2 for paper");
            System.out.println("Enter 3 for scissor");
            System.out.println("Enter your choice:");
            int player = sc.nextInt();
            int comp = random.nextInt(3) + 1;
            if (player == 1) {
                System.out.println("Your choice:Rock");
                if (comp == 3) {
                    System.out.println("Computer choice:Scissor");
                    System.out.println("Congratulations you won");
                    playScore++;
                } else if (comp == 2) {
                    System.out.println("Computer choice:Paper");
                    System.out.println("Oops you lose");
                    compScore++;
                } else {
                    System.out.println("Computer choice:Rock");
                    System.out.println("Ohhhhooo that's Tie");
                    compScore++;
                    playScore++;
                }
            } else if (player == 2) {
                System.out.println("Your choice:Paper");
                if (comp == 1) {
                    System.out.println("Computer choice:Rock");
                    System.out.println("Congratulations you won");
                    playScore++;
                } else if (comp == 3) {
                    System.out.println("Computer choice:Scissor");
                    System.out.println("Oops you lose");
                    compScore++;
                } else {
                    System.out.println("Computer choice:Paper");
                    System.out.println("Ohhhhooo that's Tie");
                    compScore++;
                    playScore++;
                }
            } else if (player == 3) {
                System.out.println("Your choice:Scissor");
                if (comp == 2) {
                    System.out.println("Computer choice:Paper");
                    System.out.println("Congratulations you won");
                    playScore++;
                } else if (comp == 1) {
                    System.out.println("Computer choice:Rock");
                    System.out.println("Oops you lose");
                    compScore++;
                } else {
                    System.out.println("Computer choice:Scissor");
                    System.out.println("Ohhhhooo that's Tie");
                    compScore++;
                    playScore++;
                }
            }
            System.out.println("=========== Score ===========");
            System.out.println("Your score:" + playScore);
            System.out.println("Computer score:" + compScore);
        }
        System.out.println("=========== Final ===========");
        if (compScore < playScore) {
            System.out.println("Congratulations You won the game");
        } else if (compScore > playScore) {
            System.out.println("Oops You lose the game");
        } else {
            System.out.println("OOOhhhhhhhoo that's Tie");
        }

        sc.close();
    }
}