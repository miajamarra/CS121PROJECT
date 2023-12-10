package WEEKfour;

import javax.swing.*;
import java.util.Random;

public class ESPGame {
    public static void   main(String[] args) {
        Random random = new Random();
        int correct = 0;
        int number;
        String COLOR;
        String guess;
        for (int i = 0; i <= 5; i++) {
            number = random.nextInt(5);
            if (number == 0) {
                COLOR = "red";
            } else if (number == 1) {
                COLOR = "green";
            } else if (number == 2) {
                COLOR = " blue";
            } else if (number == 3) {
                COLOR = "orange";
            } else {
                COLOR = "yellow";
            }


            System.out.println("num" + i + " :Random number = " + number);
            guess = JOptionPane.showInputDialog(null, String.format("%d. What color has the computer chose?\n", i));
            JOptionPane.showMessageDialog(null, String.format("The computer chose %s",COLOR));
            if (guess.equals(COLOR)) {
                correct++;
            }

            //0 = red
            // 1 = green
            // 2 = blue
            // 3 = orange
            // 4 = yellow

        }
        JOptionPane.showMessageDialog(null,String.format("YOU GOT %d OUT OF 10 CORRECT.",correct ));

    }
}
