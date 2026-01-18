public class RoomType {
    private RoomKind kind;
    private Money cost;

    public RoomType(RoomKind kind, Money cost) {
        this.kind = kind;
        this.cost = cost;
    }

    public RoomKind getKind() {
        return kind;
    }

    public Money getCost() {
        return cost;
    }
}