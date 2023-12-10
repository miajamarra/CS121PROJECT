package WEEKTen.examples.abstractClasses.interfaces;

public abstract class Movie {
    protected String movieName;
    protected String movieRate ;
    public Movie(){


    }
    public Movie(String movieName, String movieRate){
        this.movieName = movieName;
        this.movieRate = movieRate;
    }
    //setters and getters
    //abstract methods
    public abstract void displayInfo();
}
