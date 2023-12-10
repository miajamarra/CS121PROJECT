package WEEK16;

import javax.swing.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class WorkVacation {
    public static void main(String[] args) {

       DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
       Scanner scanner = new Scanner(System.in) {SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

           String  = JOptionPane.showInputDialog("Enter the amount of caleries per day by diet:");
           String startDate = JOptionPane.showInputDialog("Enter  the  mm/dd/yyyy diet starts :");
           String endDate = JOptionPane.showInputDialog("Enter the  mm/dd/yyyy diet ends :");

            int Totalcalleries = WEEK16.Totalcalleries.calculateTotalcallaries(caloriesperday, startDate, endDate);

            Print the result
           if(totalCalories >=0){System.out.println("Total calories consumed during the diet period: " + totalCalories);

            Date start;

            {try {
                  start = dateFormat.parse(startDate);
            } catch (ParseException e) {
                throw new RuntimeException(e);
                }
            }

            Date end = dateFormat.parse(endDate);

           long difference = end.getTime() - start.getTime();
           int daysOnDiet = (int) (difference / (1000 * 60 * 60 * 24));

              int i = caloriesperday * daysOnDiet;
                return i;
             Close the scanner scanner.close();

