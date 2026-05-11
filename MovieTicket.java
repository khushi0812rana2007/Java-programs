class MovieTicket {
private String seatNumber;
private boolean isBooked;

public MovieTicket(String seatNumber) {
    this.seatNumber = seatNumber;
    this.isBooked = false;
    }

public void bookSeat() {
    if (!isBooked) {
        isBooked = true;
    System.out.println("Seat " + seatNumber + " booked successfully!");
        } else {
    System.out.println("Seat already booked!");
        }
    }

public String getSeatStatus() {
    return isBooked ? "Booked" : "Available";
    }
}
