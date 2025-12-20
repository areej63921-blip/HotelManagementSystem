public class ReserverPayer {
    private String id; // Qualifier from Fig 14
    private String name;
    private String creditCardDetails;

    public ReserverPayer(String id, String name, String creditCard) {
        if (id == null || name == null) {
            throw new IllegalArgumentException("Customer ID and Name cannot be null.");
        }
        this.id = id;
        this.name = name;
        this.creditCardDetails = creditCard;
    }

    public String getId() { return id; }
}
