public class Room {
    private Integer number;
    private RoomType roomType;
    
    private Guest occupant;

    public Room(Integer number, RoomType type) {
        this.number = number;
        this.roomType = type;
    }

    public void createGuest(Name name, Address address) {
        this.occupant = new Guest(name, address);
    }

    public Integer getNumber() { return number; }
    public RoomType getRoomType() { return roomType; }
    public Guest getOccupant() { return occupant; }
}