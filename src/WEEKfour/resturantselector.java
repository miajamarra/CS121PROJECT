package WEEKfour;

import java.util.Scanner;

public class resturantselector{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Is anyone in your party vegan?");
    String vegan = console.nextLine();
    System.out.println("Is anyone in your party vegetarian?");
    String vegetarian = console.nextLine();
    System.out.println("Is anyone in your party gluten?");
    String gluten   = console.nextLine();

    System.out.println("Here are your resturant choices: \n");
    if(vegan.equals("no")) {
        System.out.println("Main Street Pizza Company\n");
    }
    if(vegan.equals ("no")&& gluten.equals("no")) {
        System.out.println("Mamas Fine Italian\n");
    }
    if(vegan.equals("no") && vegetarian.equals("no") && gluten.equals("no")) {
        System.out.println("Joes Gourmet Burgers\n");
    }

    System.out.println("The Chef's Kitchen\n");
    System.out.println("Corner Cafe\n");

    }
}
