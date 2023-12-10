package weekFIVE;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.*;
import java.sql.SQLOutput;

import static java.io.FileWriter.*;

public class Fileappend {
    public static void main(String[] args) throws IOException {
        try {

            // instance of FileWriter adn PrintWriter class
            FileWriter FileWriter = new FileWriter("textFile.txt", true);
            PrintWriter Results = new PrintWriter(FileWriter);
            String Name = JOptionPane.showInputDialog("Enter friends  name:");
            System.out.println(Name);
            String Hobby = JOptionPane.showInputDialog(" Enter friends hobby:");
            System.out.println(Hobby);
            String Hometown = JOptionPane.showInputDialog("Enter  your friends hometown:");
            System.out.println(Hometown);
            Results.printf("%n%s %s %s", Name, Hobby, Hometown);
            //close
            Results.close();
            FileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Issue");
            // close out printwriter and filewriter

        }
    }

    private static void close() {
    }
}








