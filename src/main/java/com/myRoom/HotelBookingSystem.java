package com.myRoom;

import java.io.*;
import java.sql.*;
import java.util.*;
import com.myRoom.*;

public class HotelBookingSystem {
    static Scanner sc = new Scanner(System.in);
    static List<Room> rooms = new ArrayList<>();
    static Connection conn;

    public static void main(String[] args) throws Exception {
        connectDatabase();
        loadRoomsFromDB();

        boolean exit = false;
        while (!exit) {
            System.out.println("\n Hotel Booking System ");
            System.out.println("1. Display Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Save Bookings to File");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    displayRooms();
                    break;
                case 2:
                    bookRoom();
                    break;
                case 3:
                    saveBookingsToFile();
                    break;
                case 4:
                    exit = true;
                    conn.close();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void connectDatabase() throws Exception {
        conn = DBconnection.getConnection();
        System.out.println("Database Connected.");
    }

    static void loadRoomsFromDB() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM rooms");
        while (rs.next()) {
            rooms.add(new Room(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
        }
        rs.close();
        stmt.close();
    }

    static void displayRooms() {
        Thread t = new Thread(() -> {
            System.out.println("\nAvailable Rooms:");
            for (Room r : rooms) {
                System.out.println(r);
            }
        });
        t.start();
        try { t.join(); } catch (Exception e) {}
    }

    static void bookRoom() {
        System.out.print("Enter Room ID to book: ");
        int roomId = sc.nextInt();
        for (Room r : rooms) {
            if (r.getRoomId() == roomId && !r.isBooked()) {
                r.setBooked(true);
                System.out.println("Room " + roomId + " booked successfully!");
                return;
            }
        }
        System.out.println("Room not found or already booked.");
    }

    static void saveBookingsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bookings.dat"))) {
            oos.writeObject(rooms);
            System.out.println("Bookings saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
