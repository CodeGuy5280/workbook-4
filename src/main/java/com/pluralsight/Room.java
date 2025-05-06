package com.pluralsight;
//must be clean && unoccupied
public class Room {

    private int NumberOfBeds;
    private double Price;
    private boolean Occupied;
    private boolean Dirty;


    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.NumberOfBeds = numberOfBeds;
        this.Price = price;
        this.Occupied = isOccupied;
        this.Dirty = isDirty;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    public boolean isDirty() {
        return Dirty;
    }

    public boolean isAvailable() {
        return !Occupied && !Dirty;
    }

    public int getNumberOfBeds() {
        return NumberOfBeds;
    }

    public double getPrice() {
        return Price;
    }

    public boolean checkIn() {
        if (!Occupied && !Dirty) {
            Occupied = false;
            Dirty = false;
        }
        return false;

    }

    public boolean checkOut() {
        if (Occupied == true) {
        }
        return false;
    }

    public boolean cleanRoom() {
        if (!Occupied) {
            Dirty = false;
        }
        return true;
    }
}