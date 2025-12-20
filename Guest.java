public class Guest {
    private String name;
    private String passportNumber;

    public Guest(String name, String passportNumber) {
        if (name == null || passportNumber == null) {
            throw new IllegalArgumentException("Guest details cannot be null.");
        }
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() { return name; }
}

