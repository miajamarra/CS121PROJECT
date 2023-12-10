package weekFIVE;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File writeToFile = new File("textFile.txt");
        try{
            Scanner console = new Scanner(writeToFile);
            while (console.hasNextLine()){
                String Name = console.nextLine();
                String Hobby = console.nextLine();
                String Hometown = console.nextLine();
                System.out.println(Name);
                System.out.println(Hobby);
                System.out.println(Hometown);
            }
            console.close();

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }
}
