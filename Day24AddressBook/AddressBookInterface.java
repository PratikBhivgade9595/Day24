package Day24AddressBook;

import java.util.ArrayList;

public class AddressBookInterface {
    public void displayContacts(ArrayList<AddressBook> addressBooks) {
        System.out.println("Displaying Contacts");
        for (AddressBook addressBook : addressBooks) {
            System.out.println(addressBook);
        }
    }
}
