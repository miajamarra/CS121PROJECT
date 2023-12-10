package loopactivities;

import java.io.PrintStream;
import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int NumStudent;
        int NumTest;
        int TotalScore = 0;
        int TestScore =0;
        double AverageScore;
        System.out.println(" Enter the number of students:");
        NumStudent = Integer.parseInt(console.nextLine());
        System.out.println("Enter the number of tests per student");
        NumTest = Integer.parseInt(console.nextLine());
        int i;
        for (i = 1; i <= NumStudent; i++) {
            TotalScore = 0;
            System.out.printf("Student number %d%n", i);
            int k;
            for (k = 1; k <= NumTest; k++) {
                System.out.printf("Enter the scores %d%n", k);
                TestScore= Integer.parseInt(console.nextLine());
                TotalScore+= TestScore;


            }
            AverageScore= (double)TestScore/NumTest;
            System.out.printf("The average for the student %d%n is %.2f%n",i,AverageScore);

        }

    }


}

