package weekFIVE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws FileNotFoundException {


        // instance of the file class
        File file = new File("cources.txt"); //relative path
        // or
        // absolute path
        // file file2 = new File("")
        try {
            // READ FILE
            Scanner scanner = new Scanner(file);
            String header = scanner.nextLine();
            while (scanner.hasNextLine()) {
               /* String Line = scanner.nextLine();
                System.out.println(Line);*/
                String cource = scanner.next();
                int credits =  Integer.parseInt(scanner.next());
                int score = Integer.parseInt(scanner.next());
                System.out.printf("%-7s %3d %7d\n" , cource, credits, score);
            }

        } catch(FileNotFoundException e){
            //e.printStackTrace();
            System.err.println(" FILE NOT FOUND YOUR PATH HAS ISSUES ******");
        }
    }
}
