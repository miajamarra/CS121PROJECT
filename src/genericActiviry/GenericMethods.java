package genericActiviry;

import java.util.ArrayList;

public class GenericMethods {
    //ARRAYS []
  public <E>  void printArray(E[] inputArray){
      for (E element:inputArray){
          System.out.print(element + "");

      }
      System.out.println();
  }
//ARRAY LISTS
    public <T>  void printArray(ArrayList<T> inputArray){
        for (T element:inputArray){
            System.out.print(element + "");

        }
        System.out.println();
    }
}