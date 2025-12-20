public class Room {
    // Fig 19: Defining States
    public enum RoomStatus {
        FREE, RESERVED, OCCUPIED
    }

    private int number;
    private RoomStatus status;

    public Room(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Room number must be positive.");
        }
        this.number = number;
        this.status = RoomStatus.FREE; // Default state from Fig 19
    }

    // Methods to handle transitions based on State Chart
    public void reserve() {
        if (this.status != RoomStatus.FREE) {
            throw new IllegalStateException("Room is not FREE to be reserved.");
        }
        this.status = RoomStatus.RESERVED;
    }

    public void checkIn() {
        if (this.status == RoomStatus.OCCUPIED) {
            throw new IllegalStateException("Room is already occupied.");
        }
        this.status = RoomStatus.OCCUPIED;
    }

    public void makeFree() {
        this.status = RoomStatus.FREE;
    }

    public int getNumber() { return number; }
    public RoomStatus getStatus() { return status; }
}