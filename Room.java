public class Room {
    
    public enum RoomStatus { FREE, RESERVED, OCCUPIED }
    
    private int number; 
    private RoomStatus status = RoomStatus.FREE; 
    private RoomType roomType; // Association to RoomType
    private Guest occupant;    

    public Room(int number, RoomType type) {
        this.number = number;
        this.roomType = type;
    }

    public RoomType getRoomType() { 
        return roomType; 
    }

    public RoomStatus getStatus() { 
        return status; 
    }

    public void createGuest(String name, String address) {
        this.occupant = new Guest(name, address);
        this.status = RoomStatus.OCCUPIED;
    }

    public int getNumber() { return number; }
}