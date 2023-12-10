package weekFIVE;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console= new Scanner(System.in);
        File writeTofile = new File("texFile.txt");
        PrintWriter  Results = new PrintWriter(writeTofile);
        String Name;
        String Hobby;
        String  Hometown;
            Results.printf("%s %s %s\n","information", "about", "friend");
            for (int n =1; n<=3; n++){
            System.out.println(" Enter friends name:");
            Name= console.nextLine();
            System.out.println("Enter friends hobby:");
            Hobby= console.nextLine();
            System.out.println(" Enter friends HomeTown: ");
            Hometown= console.nextLine();
            Results.printf("%s %s %s\n", Name, Hobby, Hometown);
        }

Results.close();
    }
}
