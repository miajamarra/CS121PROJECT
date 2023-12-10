package WEEKNine;

public class MovieBookingStimulation {
    public static void main(String[] args) {
        // step 1 initialize the theatre
        int[][] theater = new int[5][10];
        for (int n = 0; n < 5; n++) {
            for (int i = 0; i < 10; i++) {
                theater[n][i] = 0;
            }

        }
        String[][] movies = {
                {"ANTMAN", "3D", "8", "$8"},
                {" Naruto: The Last", "3D", "20", "$10"},
                {"AVATAR", "2D", "10", "$10"}
        };
        System.out.println("initial State of Theatre: ");
        for (int n = 0; n < 5; n++) {
            for (int i = 0; i < 10; i++) {
                theater[n][i] = 0;
                System.out.println(theater[n][i] + " ");
            }
            System.out.println();
        }
        System.out.println("\n Movie Showings");

        System.out.println("\n Available Movies:");
        String[] formats = {"%-20s", "%-10s", "%-10s", "%-10s"};
        System.out.printf("%-18s %-8s %-11s %-20s\n", "Movie", "Type", "Seats", "Price");
        for (String[] movieDetails : movies) {
            int index = 0;
            for (String detail : movieDetails) {
                System.out.printf(formats[index], detail);
                index++;
            }
            System.out.println();

        }
        System.out.println("\n Available Movies");
        System.out.println("Movie\t Type\t Seats\tPrice");
        for (String[] movie : movies) {
            for (String detail : movie) {
                System.out.print(detail + "\t");
            }
            System.out.println();


        }


        theater[0][1] = 1; // seat booked
        theater[0][2] = 1;// seat booked
        theater[0][3] = 1;// seat booked

        theater[1][5] = 1;// seat booked
        theater[1][6] = 1;// seat booked
        theater[1][7] = 1;// seat booked
        System.out.println("\n Updated Theater: ");


    }

}