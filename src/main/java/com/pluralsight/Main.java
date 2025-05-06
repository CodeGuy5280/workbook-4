package com.pluralsight;


public class Main {
    public static void main(String[] args) {
        // Create a Room
        Room room = new Room(2, 170, false, false);
        System.out.println("Room Details:");
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        //Guest check-in, check-out, and cleaning
        System.out.println("\nRoom Status:");
        if (room.checkIn()) {
            System.out.println("Guest has successfully checked in.");
        } else {
            System.out.println("Check-in failed. Room may be dirty or already occupied.");
        }

        if (room.checkOut()) {
            System.out.println("Guest has checked out.");
        }

        room.cleanRoom();
        System.out.println("Room has been cleaned.");

        if (room.checkIn()) {
            System.out.println("Another guest has successfully checked in.");
        }

        // Create reservation
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("\nReservation Details:");
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price per Night: $" + reservation.getPrice());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Is Weekend Stay: " + reservation.isWeekend());
        System.out.println("Total Reservation Cost: $" + reservation.getReservationTotal());

        // Create Employee and display pay info
        Employee emp = new Employee(101, "Jane Doe", "Engineering", 25.0, 45);
        System.out.println("\nEmployee Payroll:");
        System.out.println("Employee: " + emp.getName());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        System.out.println("Total Pay: $" + emp.getTotalPay());

        // Create Hotel and check rooms
        Hotel myHotel = new Hotel("Comfort Inn", 5, 10);
        System.out.println("\nHotel Availability:");
        System.out.println("Hotel Name: " + myHotel.getName());
        System.out.println("Available Suites: " + myHotel.getAvailableSuites());
        System.out.println("Available Basic Rooms: " + myHotel.getAvailableBasicRooms());

        //Room booking
        System.out.println("\nBooking Rooms:");
        boolean suiteBooked = myHotel.bookRoom(2, true);
        System.out.println("Booked 2 Suites: " + suiteBooked);
        boolean basicRoomBooked = myHotel.bookRoom(3, false);
        System.out.println("Booked 3 Basic Rooms: " + basicRoomBooked);

        //Updated availability
        System.out.println("\nHotel Availability:");
        System.out.println("Available Suites: " + myHotel.getAvailableSuites());
        System.out.println("Available Basic Rooms: " + myHotel.getAvailableBasicRooms());
    }
}