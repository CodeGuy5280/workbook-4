package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create Room
        Room room = new Room(2, 170, false, false);

        //Print details
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        // Create Reservation
        Reservation reservation = new Reservation("king", 3, true);

        // Print details
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price per Night: $" + reservation.getPrice());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Is Weekend Stay: " + reservation.isWeekend());
        System.out.println("Total Reservation Cost: $" + reservation.getReservationTotal());
        Employee emp = new Employee(101, "Jane Doe", "Engineering", 25.0, 45);

        //Print details
        System.out.println("Employee: " + emp.getName());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        System.out.println("Total Pay: $" + emp.getTotalPay());
    }
}
