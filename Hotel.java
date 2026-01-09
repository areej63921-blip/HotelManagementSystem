import java.util.*;

public class Hotel {
    private String name; 
    private List<Room> rooms = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public void createReservation() {
        
        System.out.println("[Hotel] " + name + " is now processing a new reservation request.");
    }

    public boolean available(RoomType type) {
        for (Room r : rooms) {
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
    
    public List<Room> getRooms() { return rooms; }
}