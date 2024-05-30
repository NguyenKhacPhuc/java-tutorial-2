package AdvanceEx;

public final class Address {
    private final String street;
    private final String city;
    private final String zipcode;

    // Constructor to initialize all fields
    public Address(String street, String city, String zipcode) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    // Getter for street
    public String getStreet() {
        return street;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Getter for zipcode
    public String getZipcode() {
        return zipcode;
    }

    public void displayAdressDetail() {
        System.out.println("Street: " + this.street);
        System.out.println("City : " + this.city);
        System.out.println("Zipcode : " + this.zipcode);
    }
}
