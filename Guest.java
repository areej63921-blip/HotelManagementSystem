public class Guest {
    private String name;           
    private String addressDetails; 

    public Guest(String name, String address) {
        this.name = name;
        this.addressDetails = address;
    }

    public String getName() { 
        return name; 
    }

    public String getAddress() {
        return addressDetails; 
    }
}