package WEEKfour;


import java.io.PrintStream;
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int Floors;
        int TotalRooms = 0;
        int TotalOccupiedRooms = 0;
        int TotalVacantRooms;
        double Occupancyrate;
        System.out.println("How many floors does the Hotel have? ");
        Floors = Integer.parseInt(keyboard.nextLine());
        for (int i = 1 ; i <=Floors; i++){
            System.out.printf("Enter the number of rooms on floors %d%n", i);
            int Rooms =Integer.parseInt(keyboard.nextLine());
            System.out.println("How many rooms are occupied?");
            int occupiedRooms = Integer.parseInt(keyboard.nextLine());

            TotalRooms= TotalRooms + Rooms;
            TotalOccupiedRooms= TotalOccupiedRooms + occupiedRooms;


        }
        TotalVacantRooms= TotalRooms-TotalOccupiedRooms;
        Occupancyrate=  (double)TotalOccupiedRooms/TotalRooms;
        System.out.printf(" Floors: %d%nRooms: %d%nOccupied Rooms: %d%nVacant Rooms: %d%nOccupancy Rate: %.2f", Floors, TotalRooms, TotalOccupiedRooms, TotalVacantRooms, (double) (Occupancyrate * 100));

    }
}
