public class Room {
    private int number; // From Fig 7 (number: Integer)
    private String state; // state: free, reserved, occupied (From State Chart Fig 19)

    public Room(int number) {
        // Defensive Check: Iqra Uni requirement for valid data
        if (number <= 0) {
            throw new IllegalArgumentException("Room number must be positive.");
        }
        this.number = number;
        this.state = "free"; // Default starting state
    }

    public int getNumber() { return number; }
    public String getState() { return state; }
}