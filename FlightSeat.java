public class FlightSeat {
    private boolean isOccupied;
    public FlightSeat(String seatNumber) {
        this.isOccupied = false;
    }
    public void occupySeat() {
        isOccupied = true;
    }
    public void releaseSeat() {
        isOccupied = false;
    }
    public String getSeatStatus() {
        return isOccupied ? "Occupied" : "Vacant";
    }
}

