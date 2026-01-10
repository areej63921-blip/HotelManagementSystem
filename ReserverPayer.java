public class ReserverPayer {
    private String creditCardDetails;
    private String id;
    private String name;

    public ReserverPayer(String id, String name, String cc) {
        this.id = id;
        this.name = name;
        this.creditCardDetails = cc;
    }

    public String getName() {
        return name;
    }

    public String getPaymentInfo() {
        return "ID: " + id + ", Card: " + creditCardDetails; 
    }
}