package Day24AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookRepository {

    ArrayList<AddressBook> contact = new ArrayList<>();
    AddressBookInterface aI = new AddressBookInterface();

    public void handleAddressBookSelection(int option) {
        switch (option){
            case 1 :
                readData();
                break;
            case 2 :
                aI.displayContacts(getAddressBookList());
                break;
            case 3 :
                System.out.println("Enter Name To Edit");
                Scanner sc = new Scanner(System.in);
                String book = sc.next();
                AddressBook addressBooks = getAddressBook(book);
                editContacts(addressBooks);
                break;
            case 4 :
                System.out.println("Enter Name To Delete");
                Scanner sc1 = new Scanner(System.in);
                String name = sc1.next();
                AddressBook addressBook = getAddressBook(name);
                deleteContacts(addressBook);
                break;
            case 5 :
                System.out.println("Enter Name Of City");
                Scanner sc2 = new Scanner(System.in);
                String city = sc2.next();
                AddressBook book1 = getCityList(city);
                searchCity(book1);
                break;
            case 6 :
                System.out.println("Enter Name of State");
                Scanner sc3 = new Scanner(System.in);
                String state = sc3.next();
                AddressBook b = getStateList(state);
                searchState(b);
                break;
            case 7 :
                System.out.println("Exit");
                break;
            default:
                System.out.println("invalid");
        }
    }

    private void searchState(AddressBook b) {
        System.out.println(b);
    }

    private AddressBook getStateList(String state) {
        return contact.stream().filter(book -> book.state.equals(state)).findFirst().orElse(null);
    }

    private void searchCity(AddressBook book1) {
       System.out.println(book1);
    }


    private AddressBook getCityList(String city) {
        return contact.stream().filter(book -> book.city.equals(city)).findFirst().orElse(null);
    }

    private void deleteContacts(AddressBook addressBook) {
        contact.remove(addressBook);
    }

    private AddressBook getAddressBook(String name) {
        return contact.stream().filter(book -> book.firstName.equals(name)).findFirst().orElse(null);
    }


    private void editContacts(AddressBook book) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Option : \n 1. First Name \n 2. Last Name \n 3. Address " +
                "\n 4. City \n 5. State \n 6. Email \n 7. PinCode \n 8. Phone Number \n 9.Exit");
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter Name");
                book.firstName = sc.next();
                break;
            case 2:
                System.out.println("Enter last Name");
                book.lastName = sc.next();
                break;
            case 3:
                System.out.println("Enter Address");
                book.address = sc.next();
                break;
            case 4:
                System.out.println("Enter City");
                book.city = sc.next();
                break;
            case 5:
                System.out.println("Enter State");
                book.state = sc.next();
                break;
            case 6:
                System.out.println("Enter Email");
                book.email = sc.next();
                break;
            case 7:
                System.out.println("Enter Pincode");
                book.pinCode = sc.nextInt();
                break;
            case 8:
                System.out.println("Enter Phone Number");
                book.phoneNumber = sc.nextLong();
                break;
            case 9:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid");
        }

    }

    public ArrayList<AddressBook> getAddressBookList() {
        return contact;
    }

    private void readData() {
        AddressBook book = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details");
        System.out.println("Enter First Name");
        book.firstName = sc.next();
        System.out.println("Enter Last Name");
        book.lastName = sc.next();
        System.out.println("Enter The Address");
        book.address = sc.next();
        System.out.println("Enter The City");
        book.city = sc.next();
        System.out.println("Enter The State");
        book.state = sc.next();
        System.out.println("Enter The PinCode");
        book.pinCode = sc.nextInt();
        System.out.println("Enter The PhoneNumber");
        book.phoneNumber = sc.nextLong();
        System.out.println("Enter The Email");
        book.email = sc.next();
        add(book);
    }
       
    public int showMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option : \n 1. Add Contact. \n 2. Display Contact. \n 3. Edit Contact." +
                "\n 4. Delete Contact. \n 5. Search By City. \n 6. Search By State. \n 7. Exit");

        return sc.nextInt();
    }

    public void add(AddressBook book){
        contact.add(book);
    }

}
