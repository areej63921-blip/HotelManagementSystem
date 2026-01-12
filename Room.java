public class Room {
    public enum RoomStatus { FREE, RESERVED, OCCUPIED }
    
    private final int number;
    private RoomStatus status = RoomStatus.FREE;
    private final RoomType roomType;
    private Guest occupant;

    public Room(int number, RoomType type) {
        if (type == null) throw new IllegalArgumentException("Room must have a valid RoomType.");
        this.number = number;
        this.roomType = type;
    }

    public void createGuest(String name, String address) {
       
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Guest name cannot be empty.");
        this.occupant = new Guest(name, address);
        this.status = RoomStatus.OCCUPIED;
    }

    public RoomType getRoomType() { return roomType; }
    public RoomStatus getStatus() { return status; }
    public int getNumber() { return number; }
}