package org.example;

// Room class with properties number, type, and occupied (boolean)

public class Room {
    private int number;
    private String type;
    private boolean occupied;

    // Constructor
    public Room(int number, String type, boolean occupied) {
        this.number = number;
        this.type = type;
        this.occupied = occupied;
    }

    // Getters and setters
    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    // toString method
    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", occupied=" + occupied +
                '}';
    }
}
