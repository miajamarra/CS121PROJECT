package setAndIteratorActivity;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MovieCollectionSet {
    private Set<String> movies = new HashSet<>();

    public void addMovies() {
        Scanner scanner = new Scanner(System.in);
        String MOVIEName;



        while (true) {
            System.out.println("Enter movie names set or  enter 0 to quit:");
            MOVIEName = scanner.nextLine();

            if (MOVIEName.equals("0")) {

                System.out.println("you have chozen to quit");

                break;

            } else {
                movies.add(MOVIEName);
            }
        }
    }


        public void displayMovies(){
            System.out.println("Movie Collection Set:");
            Iterator<String> iterator = movies.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

    }
}