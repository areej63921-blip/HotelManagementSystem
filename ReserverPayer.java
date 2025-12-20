public class ReserverPayer {
    private String id;
    private String name;
    private String creditCardDetails;

    public ReserverPayer(String id, String name, String creditCard) {
        this.id = id;
        this.name = name;
        this.creditCardDetails = creditCard;
    }

    public String getId() { return id; }

    // In variables ko use karne ke liye ye method add karein
    public String getPayerSummary() {
        return "Payer: " + name + " (Card: " + creditCardDetails + ")";
    }
}