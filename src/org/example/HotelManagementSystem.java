package org.example;

import java.util.List;
import java.util.Scanner;

public class HotelManagementSystem {

    public static void main(String[] args) {
        Room room1 = new Room(1, "Single", false);
        Room room2 = new Room(2, "Double", true);
        Room room3 = new Room(3, "Single", false);

        Hotel hotel = new Hotel("Hilton123", List.of(room1, room2, room3), List.of());

        Scanner scanner = new Scanner(System.in);

        // make a while loop that runs until the user enters "quit"

        while (true) {

            System.out.println("Welcome to the Hotel Management System");
            System.out.println("1 : Display rooms :");
            System.out.println("2 : Display reservations :");
            System.out.println("3 : Add a reservation :");
            System.out.println("4 : Quit :");

            int choice = scanner.nextInt();

            // create a switch statement that handles the user's choice

            switch (choice) {
                case 1:
                    System.out.println("Displaying rooms");
                    for (Room room : hotel.getRooms()) {
                        System.out.println(room);
                    }
                    break;
                case 2:
                    System.out.println("Displaying reservations");
                    for (Reservation reservation : hotel.getReservations()) {
                        System.out.println(reservation);
                    }
                    break;
                case 3:
                    System.out.println("Adding a reservation");
                    System.out.println("Enter guest name");
                    String guestName = scanner.next();
                    System.out.println("Enter guest phone number");
                    String guestPhoneNumber = scanner.next();
                    System.out.println("Enter room number");
                    int roomNumber = scanner.nextInt();
                    System.out.println("Enter number of guests");
                    int numberOfGuests = scanner.nextInt();
                    System.out.println("Enter check in date");
                    String checkInDate = scanner.next();
                    System.out.println("Enter check out date");
                    String checkOutDate = scanner.next();
                    Reservation reservation = new Reservation(room1, guestName, guestPhoneNumber, roomNumber, numberOfGuests, checkInDate, checkOutDate);
                    hotel.getReservations().add(reservation);
                    break;
                case 4:
                    System.out.println("Quitting");
                    return;
                default:
                    System.out.println("Invalid choice");
            }





        }













    }

    static void displayRooms(Hotel hotel) {
        System.out.println("Reservations in " + hotel.getName() + ":\n");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("| %-10d | %-20s | %-20s | %-20d | %-20s | %-20s |\n", "Room number", "Guest Name", "Guest Phone Number",  "Number of guests", "Check in date", "Check out date", "Total Price");
        System.out.println("-------------------------------------------------------------------------");
        for (Reservation reservation : hotel.getReservations()) {
            System.out.printf("| %-10d | %-20s | %-20s | %-20d | %-20s | %-20s |\n", reservation.getRoomNumber(), reservation.getGuestName(), reservation.getGuestPhoneNumber(), reservation.getNumberOfGuests(), reservation.getCheckInDate(), reservation.getCheckOutDate(), reservation.getRoomNumber());

        }
        System.out.println("-------------------------------------------------------------------------\n");


    }


}
