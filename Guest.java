// UML type 'Name' ke liye
class Name {
    private String first, last;
    public Name(String f, String l) { this.first = f; this.last = l; }
    @Override
    public String toString() { return first + " " + last; }
}

// UML type 'Address' ke liye
class Address {
    private String details;
    public Address(String d) { this.details = d; }
}
public class Guest {
    // 1. Attributes (As shown in UML box)
    private Name name;               // UML: name : Name
    private Address addressDetails;  // UML: addressDetails : Address

    // 2. Constructor (UML: create())
    // Diagram ke niche 'create()' ka matlab yahi hai
    public Guest(Name name, Address addressDetails) {
        this.name = name;
        this.addressDetails = addressDetails;
    }

    // 3. Methods (Standard Getters)
    public Name getName() {
        return name;
    }

    public Address getAddressDetails() {
        return addressDetails;
    }
}