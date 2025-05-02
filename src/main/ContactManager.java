package main;

import data.Contact;
import logic.ContactDirectory;

/**
 * Developed By: Luis Marin
 */
public class ContactManager {

    public static void main(String[] args) {

        ContactDirectory contactDirectory = new ContactDirectory();

        //Adding new contacts
        System.out.println("Adding contacts. . .");
        contactDirectory.addContact(new Contact(1 , "Juan" , "5478652130" , "mail@live.com" , "Personal"));
        contactDirectory.addContact(new Contact(2 , "Angel" , "3024059692" , "ang@mail.com" , "Professional"));
        contactDirectory.addContact(new Contact(3 , "Xiomara" , "6832532058" , "xiom@gmail.com" , "Personal"));
        contactDirectory.addContact(new Contact(4 , "Paul" , "5316432756" , "paul@live.com" , "Professional"));
        contactDirectory.addContact(new Contact(5 , "Jake" , "4642378645" , "jake@mail.com" , "Personal"));
        contactDirectory.addContact(new Contact(6 , "John" , "3125778128" , "john@gmail.com" , "Professional"));
        contactDirectory.addContact(new Contact(7 , "Axel" , "1235498753" , "axel@live.com" , "Personal"));
        contactDirectory.addContact(new Contact(8 , "Robert" , "8796584264" , "robert@mail.com" , "Personal"));
        contactDirectory.addContact(new Contact(9 , "Dany" , "8795462158" , "dany@gmail.com" , "Personal"));
        contactDirectory.addContact(new Contact(10, "Lisa" , "2135876845" , "lisa@live.com" , "Professional"));


        //Displaying the contacts
        System.out.println("\nDisplaying contacts. . .");
        contactDirectory.displayContacts();

        //Preventing duplicate contact types (Trying to register at every new contact registration)
        System.out.println("\nShowing contact types. . .");
        contactDirectory.showContactTypes();

        //Searching for contacts by name
        System.out.println("\nLooking for contact info of Jake. . .");
        contactDirectory.getContactByName("Jake");

        //Updating a contact details
        System.out.println("\nUpdating Juan email to juan@outlook.com. . .");
        Contact contactToUpdate = new Contact();
        contactToUpdate.setEmail("juan@outlook.com");
        contactDirectory.updateContactByName("Juan" , contactToUpdate);

        //Sorting contact list by name and displaying
        System.out.println("\nSorting contacts by name. . .");
        contactDirectory.sortContactsByName();
        contactDirectory.displayContacts();
    }
}
