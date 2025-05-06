package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // Constructor 1
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // Constructor 2
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    // Derived getters (calculate on the fly)
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableBasicRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    // Book room
    public boolean bookRoom(int numberOfRoomsToBook, boolean isSuite) {
        if (isSuite) {
            if (numberOfRoomsToBook <= getAvailableSuites()) {
                bookedSuites += numberOfRoomsToBook;
                return true;
            }
        } else {
            if (numberOfRoomsToBook <= getAvailableBasicRooms()) {
                bookedBasicRooms += numberOfRoomsToBook;
                return true;
            }
        }
        return false;
    }
}