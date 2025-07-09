package com.myRoom;

import java.io.Serializable;

public class Room implements Serializable {
    private int roomId;
    private String type;
    private double price;
    private boolean isBooked;

    public Room(int roomId, String type, double price) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
        this.isBooked = false;
    }

    public int getRoomId() { return roomId; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public boolean isBooked() { return isBooked; }
    public void setBooked(boolean booked) { isBooked = booked; }

    @Override
    public String toString() {
        return "Room [ID=" + roomId + ", Type=" + type + ", Price=" + price + ", Booked=" + isBooked + "]";
    }
}
