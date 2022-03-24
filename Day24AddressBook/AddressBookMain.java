package Day24AddressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Computation");
        AddressBookRepository aBR = new AddressBookRepository();
        int option = 0;
        while (option != 7 ) {
            option = aBR.showMainMenu();
            aBR.handleAddressBookSelection(option);
        }
    }
}
