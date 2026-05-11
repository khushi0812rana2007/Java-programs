public class HotelRoomStatus {
    private boolean isOccupied;
    private String guestName;

    public HotelRoomStatus() {
        isOccupied = false;
        guestName = "";
    }
    public void checkIn(String name) {
        if (!isOccupied) {
            isOccupied = true;
            guestName = name;
            System.out.println(name + " checked in successfully!");
        } else {
            System.out.println("Room already occupied!");
        }
    }
    public void checkOut() {
        isOccupied = false;
        guestName = "";
        System.out.println("Room is now available.");
    }
    public String getRoomStatus() {
        return isOccupied ? "Occupied by " + guestName : "Available";
    }
}
