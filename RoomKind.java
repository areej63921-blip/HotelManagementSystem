public class RoomKind {
    public static final RoomKind SINGLE = new RoomKind("SINGLE");
    public static final RoomKind DOUBLE = new RoomKind("DOUBLE");
    public static final RoomKind SUITE = new RoomKind("SUITE");
    public static final RoomKind DELUXE = new RoomKind("DELUXE");

    private final String kindName;

    private RoomKind(String name) {
        this.kindName = name;
    }

    public String getKindName() {
        return kindName;
    }

    @Override
    public String toString() {
        return kindName;
    }
}