import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    // Helper method to add rooms to hotel
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Fig 16: Logic to check if any room is FREE
    public Room findFreeRoom() {
        for (Room room : rooms) {
            if (room.getStatus() == Room.RoomStatus.FREE) {
                return room; // Return the first free room found
            }
        }
        return null; // No room available
    }

    public String getName() { return name; }
}