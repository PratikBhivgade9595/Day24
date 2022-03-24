package Day24AddressBook;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    int pinCode;
    long phoneNumber;


    @Override
    public String toString() {
        return "AddressBook{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", pinCode=" + pinCode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
