package weekTWO;

import java.util.Scanner;

public class IntegerDiv{
    public static void main(String[] args){
        //Console Input
        //Scanner class
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = keyboard.nextLine();
        System.out.println(firstName);

        System.out.println("What is your age?");
        int age = Integer.parseInt(keyboard.nextLine());

        double gpa = Double.parseDouble(keyboard.nextLine());
        System.out.println(gpa);

        int numOne = 1;
        int numTwo = 2;
        // Casting integer as a double
        double results = (double)numOne/numTwo;
        System.out.print(results);

        //does integer divisionthen cast as a double
        double result = (double)(numOne/numTwo);
        System.out.print(result);

    }
}
