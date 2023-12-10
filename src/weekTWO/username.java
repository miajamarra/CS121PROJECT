package weekTWO;

import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = console.nextLine();
        //lowercase
        System.out.println(name.toLowerCase());
        //.toupperCase())
        System.out.println(name.toLowerCase());

        StringBuilder reverseName = new StringBuilder(name);
        System.out.println(reverseName.reverse());
    }
}
