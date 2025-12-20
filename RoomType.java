public class RoomType {
    private String kind; // From Fig 7 (kind: RoomKind)
    private double cost; // From Fig 7 (cost: Money)

    public RoomType(String kind, double cost) {
        // Defensive checks for clean code
        if (kind == null || kind.trim().isEmpty()) {
            throw new IllegalArgumentException("Room kind cannot be null or empty.");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Room cost cannot be negative.");
        }
        this.kind = kind;
        this.cost = cost;
    }

    public String getKind() { return kind; }
    public double getCost() { return cost; }
}