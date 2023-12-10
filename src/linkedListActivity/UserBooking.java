package linkedListActivity;

import java.util.LinkedList;

public class UserBooking {
   private String username;
   private String movieTitle;
   private int runTime;
   private String genre;
   private String description;
   private String theater;
  private   String TheaterLists;
  private LinkedList<String> theaterList;
  public UserBooking (String username, String movieTitle,int runTime, String genre, String description, String theater, String theaterLists ) {
      this.username = username;
      this.movieTitle = movieTitle;
      this.runTime = runTime;
      this.genre = genre;
      this.description = description;
      this.theater = theater;
      this.theaterList = new LinkedList();

  }

public void addTheater(String theater) {
    theaterList.add(theater);
}

public void removeTheater(String theater){
    theaterList.remove(theater);
}
public String getUserInfo(){
    return String.format("MOVIE TITLE: %S%n runTime: %s%n GENRE%s%n", movieTitle, runTime, genre, description);
}
 public  void displayTheaters(){
        System.out.println("Theaters: "+theaterList);
}
}