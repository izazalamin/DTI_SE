package day8;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int nextUserId = 1;
    private int userId;
    private String name;
    private String contactInformation;
    private List<Booking> bookings;

    public User(String name, String contactInformation) {
        this.userId = nextUserId++;
        this.name = name;
        this.contactInformation = contactInformation;
        this.bookings = new ArrayList<>();
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
}
