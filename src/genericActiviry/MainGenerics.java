package genericActiviry;

import java.util.ArrayList;
import java.util.Arrays;

public class MainGenerics {
    public static void main(String[] args) {
        ArrayList<Integer>intArray = new ArrayList<>(Arrays.asList(2,9,5,4,7));
        ArrayList<Double> doubleArr= new ArrayList<>(Arrays.asList(1.,2.,2.,9.,3.,5.,4.,4.,7.,7.));
        ArrayList<Character> charArr= new ArrayList<>(Arrays.asList('L','I','V','H','E'));
        ArrayList<String> strArr= new ArrayList<>(Arrays.asList("Hello","From", "The", "Other", "Side"));

        // CREAT AN INSTANCE
        GenericMethods test= new GenericMethods();
        test.printArray(intArray);
        test.printArray(doubleArr);
        test.printArray(charArr);
        test.printArray(strArr);
    }

}
