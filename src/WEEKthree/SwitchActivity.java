package WEEKthree;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args) {
        String ninja = JOptionPane.showInputDialog(null, "Enter the name of " +
                "Naruto Character");
        String NarutoInfo = "";
        switch (ninja) {
            case "Naruto Uzumaki":
                NarutoInfo = " Son of the fourth hokage. and second to last of the Uzumaki clan. becomes the seventh Hokage. its apart of team seven.  has the ninetailed fox in him. treated unfairly by the village.Can use the rasengan, and  shadow clone jutsu";
                break;
            case "Sakura Haruno":
                NarutoInfo = " part of the Haruno clan. Member of team seven. has super strength. becomes Tsunades student. she is a healer. ";
                break;
            case "Shikamaru Nara":
                NarutoInfo = " in the Nara clan,  has shadow possession skill. becomes chunin.  married to temari.";
                break;
            case "Sasuke Uchiha":
                NarutoInfo = " sole suvivor of the uchiha clan.  known for chidori,  gets revenge for his clans massacre. is in team seven. ";
                break;
            default:
                NarutoInfo = "The Naruto Character you entered is not included in the list fot this program";
                break;
        }
        JOptionPane.showMessageDialog(null, NarutoInfo);
    }
}
