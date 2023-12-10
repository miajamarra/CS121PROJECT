package WEEKelleven;
import java.util.Set;
import java.util.HashSet;

public class Setnotes {
    public static void main(String[] args) {


        Set<String> MovieName = new HashSet<>();
        MovieName.add("naruto");
        MovieName.add("avatar");
        MovieName.add("Rugrats");
        MovieName.add("Superman");
        MovieName.add("naruto");
        System.out.println(MovieName);
        MovieName.remove("Rugrats");



    }
}
