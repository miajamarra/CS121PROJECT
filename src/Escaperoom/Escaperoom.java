package Escaperoom;
import java.util.Scanner;

public class Escaperoom {


    private static boolean hasKeyRoom1 = false;
    private static boolean hasKeyRoom2 = false;

    public static void main(String[] args) {


        System.out.println("You wake up in a dark room. You've been kidnapped!");
        System.out.println(" YOUR TASK : Escape from the two rooms to regain your freedom.");
        System.out.println(" You look around the room and notice that in the room your in it has one door that is open. ");
        System.out.printf("Do your want to proceed forward?:");

        // Start in Room 1
        exploreRoom1();

        // If the player has the key from Room 1, proceed to Room 2
      //  if (hasKeyRoom1) {
          //  System.out.println("\nCongratulations! You've unlocked Room 2.");
         //   exploreRoom2();
      //  } else {
      //      System.out.println("\nGame Over! You didn't escape Room 1.");
   //     }
    }

    private static void exploreRoom1() {
        System.out.println("\n--- Room 1 ---");
        System.out.println("You find yourself in a dimly lit room.  IN front of .");

        // User interaction in Room 1
        boolean hasSolvedChallenge = solveRoom1Challenge();
        if (hasSolvedChallenge) {
            System.out.println("You found a key in the chest! Use it to unlock the next room.");
            hasKeyRoom1 = true;
        } else {
            System.out.println("You couldn't solve the challenge. Look around carefully.");
        }
    }

    private static boolean solveRoom1Challenge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To unlock  find the key,");

        System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
        String userAnswer = scanner.nextLine().toLowerCase();

        return userAnswer.equals("an echo");
    }

    private static void exploreRoom2() {
        System.out.println("\n--- Room 2 ---");
        System.out.println("You've entered another room. There is a locked door with a numeric keypad.");

        // User interaction in Room 2
        boolean hasSolvedPuzzle = solveRoom2Puzzle();
        if (hasSolvedPuzzle) {
            System.out.println("Congratulations! You've successfully escaped Room 2.");
        } else {
            System.out.println("You couldn't solve the puzzle. Keep trying or look for clues.");
        }
    }

    private static boolean solveRoom2Puzzle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To unlock the door, enter the correct numeric code:");

        System.out.println("Hint: The code is related to the number of letters in the word 'freedom'.");
        int userCode = scanner.nextInt();

        return userCode == 7; // The numeric code for "freedom"
    }
}