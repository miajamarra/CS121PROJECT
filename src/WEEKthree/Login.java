package WEEKthree;

import javax.swing.*;

public class Login {
    public static void main(String[] args){
        String userName;
        String Password;

        userName = "MiaJamarra";
        Password = "Lacey20";

        String NAME = JOptionPane.showInputDialog("Enter your userName: ");
        JOptionPane.showMessageDialog(null, "You have entered: "+ NAME);
        String passWORD = JOptionPane.showInputDialog("Enter your Password: ");
        if(userName. equals (NAME ) && Password.equals(passWORD)){
            JOptionPane. showMessageDialog(null,"Welcome to CS121 ");

        } else if (!userName. equals(NAME) && Password.equals(passWORD)) {
            JOptionPane.showMessageDialog(null, "Wrong userName");
            System.out.println("Wrong userName");
        } else if (!Password. equals(passWORD) && userName. equals (NAME)) {
            JOptionPane. showMessageDialog(null, "Wrong password");
            System.out.println("Wrong password");
        }else{
            JOptionPane.showMessageDialog(null, "Both username and password are incorrect");
                    System.out.println("Both username and password are incorrect");
        }

    }
}
