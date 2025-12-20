import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name; // From Fig 7 (name: Name)
    private List<Room> rooms;
    private List<RoomType> roomTypes;

    public Hotel(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Hotel name is required.");
        }
        this.name = name;
        this.rooms = new ArrayList<>();
        this.roomTypes = new ArrayList<>();
    }

    public String getName() { return name; }
}