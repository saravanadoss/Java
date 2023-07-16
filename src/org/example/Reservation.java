package org.example;

//Reservation class with properties room, guestName, guestPhoneNumber, and roomNumber, numberOfGuests, checkInDate, checkOutDate

public class Reservation {
    private int roomNumber;
    private String guestName;
    private String guestPhoneNumber;
    private int numberOfGuests;
    private String checkInDate;
    private String checkOutDate;

    // Constructor
    public Reservation(Room room, String guestName, String guestPhoneNumber, int roomNumber, int numberOfGuests, String checkInDate, String checkOutDate) {

        this.guestName = guestName;
        this.guestPhoneNumber = guestPhoneNumber;
        this.roomNumber = roomNumber;
        this.numberOfGuests = numberOfGuests;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getters and setters



    public String getGuestName() {
        return guestName;
    }

    public String getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }



    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setGuestPhoneNumber(String guestPhoneNumber) {
        this.guestPhoneNumber = guestPhoneNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    // toString method
    @Override
    public String toString() {
        return "Reservation{" +

                ", guestName='" + guestName + '\'' +
                ", guestPhoneNumber='" + guestPhoneNumber + '\'' +
                ", roomNumber=" + roomNumber +
                ", numberOfGuests=" + numberOfGuests +
                ", checkInDate='" + checkInDate;
    }
}