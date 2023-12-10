package loopactivities;
import java.time.Month;
import java.util.Scanner;
public class AverageRainfall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int NumYears;
        int Months;
        int TotalRainfall = 0;
        double averageRainfall;
        System.out.println("Enter the number of years:");
        NumYears = Integer.parseInt(console.nextLine());
// i = inches
        for (int i = 1; i <= NumYears; i++) {
            int n;
            for (n = 1; n <= 12; n++) {
                System.out.printf("Enter the inches of rainfall for year %d  month %d%n", i, n);
                int Rainfall = Integer.parseInt(console.nextLine());
                TotalRainfall += Rainfall;
            }

        }
        Months = NumYears * 12;

        averageRainfall = (double) TotalRainfall/Months;
        System.out. printf("Number of months: %d%nTotal inches of rainfall: %d%n Average rainfall per month for %d years: %.2f", Months, TotalRainfall,NumYears, averageRainfall);

    }

}