import java.util.*;

public class Hotel {
    private Name name; 

    private List<RoomType> roomTypes; 
    private List<Room> rooms;

    public Hotel(Name name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.roomTypes = new ArrayList<>(); 
    }

        public boolean available(RoomType type) {
        for (Room r : rooms) {
            if (r.getRoomType() == type && r.getOccupant() == null) {
                return true;
            }
        }
        return false;
    }

    public void createReservation() {
        System.out.println("Processing reservation in " + name.toString());
    }

    public Name getName() { return name; }
    
    public void addRoom(Room r) { rooms.add(r); }
}