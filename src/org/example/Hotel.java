package org.example;

import java.util.List;

//Hotel class with properties name, rooms (List of Room objects), and reservations (List of Reservation objects)

public class Hotel {

    private String name;
    private List<Room> rooms;
    private List<Reservation> reservations;

    // Constructor
    public Hotel(String name, List<Room> rooms, List<Reservation> reservations) {
        this.name = name;
        this.rooms = rooms;
        this.reservations = reservations;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    // toString method
    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                ", reservations=" + reservations +
                '}';
    }
}
