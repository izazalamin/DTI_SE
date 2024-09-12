package day8;

public class Booking {
    private static int nextBookingId = 1;
    private int bookingId;
    private User user;
    private Ticket ticket;
    private TicketStatus status;

    public Booking(User user, Ticket ticket) {
        this.bookingId = nextBookingId++;
        this.user = user;
        this.ticket = ticket;
        this.status = TicketStatus.BOOKED; // Set initial status to BOOKED
    }

    // setter getter
    public int getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void confirm() {
        if (ticket.getStatus() == TicketStatus.AVAILABLE) {
            ticket.setStatus(TicketStatus.CONFIRMED);
            this.status = TicketStatus.CONFIRMED;// confirmation notice
        } else {
            System.out.println("Ticket is not available.");
        }
    }

    public void cancel() {
        if (ticket.getStatus() == TicketStatus.BOOKED) {
            ticket.setStatus(TicketStatus.AVAILABLE);
            this.status = TicketStatus.CANCELED;
            // cancelation notice
        } else {
            System.out.println("Booking cannot be canceled. Ticket is not booked.");
        }
    }
}