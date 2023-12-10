package WEEKthree;

import java.util.Scanner;
    public class Triangles {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter the length of the first side of a triangle");
            int numOne = Integer.parseInt(console.nextLine());
            System.out.println("Enter the length of the second side of a triangle");
            int numTwo = Integer.parseInt(console.nextLine());
            System.out.println("Enter the length of the third side of a triangle");
            int numThree = Integer.parseInt(console.nextLine());
            if (numOne == numTwo && numOne == numThree && numTwo == numThree) {
                System.out.println("This is a Equilateral triangle");
            } else if (numOne != numTwo && numOne != numThree && numTwo != numThree) {
                System.out.println("This is a Scalene Triangle");
            } else {
                System.out.println("This is a Isosceles Triangle");

            }
        }
    }