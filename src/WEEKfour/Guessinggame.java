package WEEKfour;

import javax.swing.*;

public class Guessinggame {
    public static void main(String[]args) {

         int x = 10;
        String values = JOptionPane.showInputDialog("Guess a number between 1 and 100 or enter  q to quit.");
        while (true){
            if (values.equals("q")) {
                JOptionPane.showMessageDialog(null, "YOU QUITTER!! YOU SUCK!! THE NUMBER WAS 10.");
                break;
            }else{
                int num = Integer.parseInt(values);
                if (num > x) {
                    JOptionPane.showMessageDialog(null, "Too HIGH!!");
                } else if (num < x) {
                    JOptionPane.showMessageDialog(null, "Too LOW!!");
                } else {
                    JOptionPane.showMessageDialog(null, "CORRECTO!!");
                    break;
                }
            }

            }
        }
    }

