package weekTWO;

import javax.swing.*;

public class StringDialog {
    public static void main(String[] args){
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


       // System.out.print("%d  %n %s");
        JOptionPane.showMessageDialog(null,String.format("There once was a person named %s who lived in %s/. At the age of %d she  went to college %s graduated with a %.2f. Then, %s adopted a(n) %s named %s  They both lived happily ever after." + Fname, city, age, college, gpa, Fname, pettype, pet ));




        // Strings
        String name = "Robin";
        //.concat()
        name.concat("Tilford");
        System.out.println(name);
        //.length()
        System.out.println(name.length());
        //.charAt()--> method in the String class
        System.out.println(name.charAt(4));
        //.replace()--> method used in the string class
        System.out.println(name.replace("Robin Tilford","Jacob)"));
        //.substring()
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(0,4));
        int x =12;
        int y = 5;
        System.out.println(x/y);

    }
}
