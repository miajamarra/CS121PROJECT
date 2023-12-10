package linkedListActivity;

public class Main {
    public static void main(String[] args) {
        UserBooking one= new UserBooking("mia", "naruto",180,"ACTION","THE EPIC CONCUSION." ,"marcus","Amc");
        UserBooking two= new UserBooking("mia2", "Up",130,"comedy","THE EPIC adventure." ,"marcus","Amc");

        one.addTheater("Marcus theater");
        one.addTheater(" amc");
        one.addTheater("imagine");

        two.addTheater("Marcison");
        two.addTheater("country club");

        System.out.println( one.getUserInfo());
        System.out.println( two.getUserInfo());
        one.getUserInfo();
        two.getUserInfo();

        one.displayTheaters();
        two.displayTheaters();

        one.removeTheater("amc");
        two.removeTheater( "country club");

        one.displayTheaters();
        two.displayTheaters();




    }


}
