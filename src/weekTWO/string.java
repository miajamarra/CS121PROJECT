package weekTWO;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class string {
    public static void main(String [] args){
    Scanner console= new Scanner(System.in);
    System.out.println("Enter your name");
    String name = console.nextLine();
    //lowercase
    System.out.println(name.toLowerCase());
    //.toupperCase())
    System.out.println(name.toLowerCase());

    System.out.println("Enter your first integer: ");
    int numOne = Integer.parseInt(console.nextLine());
    System.out.println("Enter your second integer: ");
    int numTwo = Integer.parseInt(console.nextLine());
    //Creating an instance or an object of the String Builder
    StringBuilder reverseName = new StringBuilder(name);
    System.out.println(reverseName.reverse());


     //Addition +
     int add = (numOne +numTwo);
        System.out.printf("%d + %d  = %d%n",numOne, numTwo,add);

        //subtraction
        // multiplication
        // division

        //sqareroot
        double sqrt1 =  Math.sqrt(numOne);
        System.out.printf(" The square root of %d is : %.2f",numOne,sqrt1);
        //power
        double power = Math.pow(numOne,numTwo);
        System.out.printf("The power of %d is : %.2f",numOne,power);
        //logar
        double logar = Math.log(numOne);
        System.out.printf("The log of %d is : %.2f",numOne, logar);

        //Math.abs()
        //Math.max()
        System.out.println(Math.max(4,88));
    }
}
