package weekFIVE;

import java.io.Console;
import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int total = 0;
        int expense = 0;

        System.out.println("Enter the amount budgeted for a month");
        int Budget = Integer.parseInt(console.nextLine());
        System.out.println("How many months of expenses do you have ?");
        int monthlyexpenses = Integer.parseInt(console.nextLine());

        for (int n = 1; n <= monthlyexpenses; n++) {
            System.out.printf("Enter expenses for the month %d%n",n);
            int input = Integer.parseInt(console.nextLine());
            expense = input + expense;


        }
        total = total + expense;
        System.out.printf("budget: %d%nmonthlyexpenses:  %d%ntotal:%d%n", Budget, total, monthlyexpenses);

    }
}
