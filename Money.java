public class Money {
    // UML Attributes
    private double amount;
    private String currency; 
    // Constructor
    public Money(double amount) {
        this.amount = amount;
        this.currency = "PKR"; 
    }

    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return currency + " " + amount;
    }
}