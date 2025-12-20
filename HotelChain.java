import java.util.HashMap;
import java.util.Map;

public class HotelChain {
    // Fig 14: Using Name as a Qualifier for Hotels
    private Map<String, Hotel> hotels = new HashMap<>();
    
    // Fig 14: Using ID as a Qualifier for ReserverPayers
    private Map<String, ReserverPayer> customers = new HashMap<>();

    public void addHotel(Hotel hotel) {
        if (hotel == null) throw new IllegalArgumentException("Hotel cannot be null.");
        hotels.put(hotel.getName(), hotel);
    }

    public void addCustomer(ReserverPayer customer) {
        if (customer == null) throw new IllegalArgumentException("Customer cannot be null.");
        customers.put(customer.getId(), customer);
    }
} 

