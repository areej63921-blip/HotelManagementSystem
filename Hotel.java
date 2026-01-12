import java.util.*;

public class Hotel {
    private final String name; 
    private final List<Room> rooms = new ArrayList<>();

    public Hotel(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Hotel name cannot be empty.");
        this.name = name;
    }

    public boolean available(RoomType type) {
        if (type == null) return false; // Defensive check
        for (Room r : rooms) {
            if (r.getRoomType().equals(type) && r.getStatus() == Room.RoomStatus.FREE) {
                return true;
            }
        }
        return false;
    }

     public void createReservation() {

        

        System.out.println("[Hotel] " + name + " is now processing a new reservation request.");

    }
    public void addRoom(Room room) {
        if (room != null) rooms.add(room);
    }

    public String getName() { return name; }
}