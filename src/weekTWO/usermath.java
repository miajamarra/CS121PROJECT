package weekTWO;

import java.util.Scanner;

public class usermath {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your first integer: ");

        int numOne = Integer.parseInt(console.nextLine());
        System.out.println("Enter your second integer: ");
        int numTwo = Integer.parseInt(console.nextLine());
        //Addition +
        int add = (numOne + numTwo);
        System.out.printf("%d + %d  = %d%n", numOne, numTwo, add);

        int subtraction = (numOne - numTwo);
        System.out.printf("%d - %d  = %d%n", numOne, numTwo, subtraction);

        int division = (numOne / numTwo);
        System.out.printf("%d / %d  = %d%n", numOne, numTwo, division);

        int multiplication = (numOne * numTwo);
        System.out.printf("%d * %d  = %d%n", numOne, numTwo, multiplication);

        //subtraction
        // multiplication
        // division

        //sqareroot
        double sqrt1 = Math.sqrt(numOne);
        System.out.printf(" The square root of %d is : %.2f", numOne, sqrt1);
        //power
        double power = Math.pow(numOne, numTwo);
        System.out.printf("The power of %d is : %.2f", numOne, power);
        //logar
        double logar = Math.log(numOne);
        System.out.printf("The log of %d is : %.2f", numOne, logar);

        //Math.abs()
        //Math.max()
        System.out.println(Math.max(4, 88));
    }
}