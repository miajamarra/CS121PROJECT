package weekFIVE;

import java.util.Scanner;

public class MethodActivity {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double length, width, area;
        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);
        scanner.close();

    }

    public static double getLength() {
        System.out.println("Enter the Length:\n");
        double length = Double.parseDouble(scanner.next());
        return length;
    }

    public static double getWidth() {
        System.out.println("Enter the width:\n");
        double width = Double.parseDouble(scanner.next());
        return width;
    }

    public static void displayData(double l, double w, double a) {
        System.out.printf("Rectangle length ; %.1f%nRectangle width: %.1f%nRectangle area: %.1f%n", l, w, a);
    }

    public static double getArea(double l, double w) {
        double Area = l * w;
        return Area;
    }
}

