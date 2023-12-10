package weekTWO;

import javax.swing.*;

public class activity1 {
    public static void main(String[] args ){
    //JOptionPane
    String Fname = JOptionPane.showInputDialog("Enter your name: ");
    JOptionPane.showMessageDialog(null,"you entered : " + Fname);

    //integer
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
    JOptionPane.showMessageDialog(null,("You entered:" + age));

    String college = JOptionPane.showInputDialog("Enter your  college name: ");
    JOptionPane.showMessageDialog(null,"you entered : " + college);

    //double
    double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your gpa: "));
    JOptionPane.showMessageDialog(null,"You entered: " + gpa);

    String city = JOptionPane.showInputDialog("Enter your city name: ");
    JOptionPane.showMessageDialog(null,"you entered : " + city);

    String pettype = JOptionPane.showInputDialog("Enter your pet type: ");
    JOptionPane.showMessageDialog(null,"you entered : " + pettype );
    String pet = JOptionPane.showInputDialog("Enter your pet name: ");
    JOptionPane.showMessageDialog(null,"you entered : " + pet);
    //System.out.print("%d  %n %s");
    JOptionPane.showMessageDialog(null,String.format("There once was a person named %s who lived in %s. At the age of %d she  went to college %s graduated with a %.2f. Then, %s adopted a(n) %s named %s  They both lived happily ever after." ,Fname, city, age, college, gpa, Fname, pettype, pet ));



    }
}