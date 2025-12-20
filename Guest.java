public class Guest {
    private String name;
    private String passportNumber;

    public Guest(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    // Is method se passportNumber use ho jayega aur warning chali jayegi
    public String getGuestSummary() {
        return "Guest Name: " + name + ", Passport: " + passportNumber;
    }
}