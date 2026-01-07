import java.util.*;

public class Hotel {
    private String name; 
    private List<Room> rooms = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public void createReservation() {
        // Implementation for later
    }

    public boolean available(RoomType type) {
        for (Room r : rooms) {
            // Ab r.getRoomType() aur r.getStatus() Room class mein maujood hain
            if (r.getRoomType().equals(type) && r.getStatus() == Room.RoomStatus.FREE) {
                return true;
            }
        }
        return false;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public String getName() { return name; }
}