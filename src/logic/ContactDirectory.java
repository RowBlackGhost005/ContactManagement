package logic;

import data.Contact;
import java.util.*;

/**
 * Developed By: Luis Marin
 */
public class ContactDirectory {

    private List<Contact> contacts;
    private Set<String> contactTypes;
    private Map<String, Contact> contactsMap;

    public ContactDirectory() {
        this.contacts = new ArrayList<Contact>();
        this.contactTypes = new HashSet<String>();
        this.contactsMap = new HashMap<String, Contact>();
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
        addContactType(contact.getContactType());
        addContactToMap(contact);
    }


    public void updateContact(int contactId, Contact contact) {
        for (Contact c : this.contacts) {
            if(contact.getContactId() == contactId){
                if(contact.getName() != null){
                    c.setName(contact.getName());
                }

                if(contact.getPhoneNumber() != null){
                    c.setPhoneNumber(contact.getPhoneNumber());
                }

                if(contact.getEmail() != null){
                    c.setEmail(contact.getEmail());
                }

                if(contact.getContactType() != null){
                    c.setContactType(contact.getContactType());
                }
            }
        }
    }

    public void displayContacts() {
        for (Contact c : this.contacts) {
            System.out.printf("%-2d %-12s %-10s %-20s %-10s\n", c.getContactId(), c.getName(), c.getPhoneNumber(), c.getEmail(), c.getContactType());
        }
    }

    public void sortContactsByName(){
        this.contacts.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
    }

    public void addContactType(String string){
        this.contactTypes.add(string);
    }

    public void showContactTypes(){
        for(String s : this.contactTypes){
            System.out.println(s);
        }
    }

    public void addContactToMap(Contact contact){
        this.contactsMap.put(contact.getName(), contact);
    }

    public void getContactByName(String name){
        if(!this.contactsMap.containsKey(name)){
            System.out.println("Contact not found");
        }else{
            Contact c = this.contactsMap.get(name);
            System.out.printf("%2d %25s %10s %30s %10s\n", c.getContactId(), c.getName(), c.getPhoneNumber(), c.getEmail(), c.getContactType());
        }
    }

    public void updateContactByName(String name, Contact contact){
        Contact toUpdate = this.contactsMap.get(name);
        if(toUpdate == null){
            System.out.println("Contact not found");
        }else{
            if(contact.getName() != null){
                toUpdate.setName(contact.getName());
            }

            if(contact.getPhoneNumber() != null){
                toUpdate.setPhoneNumber(contact.getPhoneNumber());
            }

            if(contact.getEmail() != null){
                toUpdate.setEmail(contact.getEmail());
            }

            if(contact.getContactType() != null){
                toUpdate.setContactType(contact.getContactType());
            }

            contactsMap.put(name, toUpdate);

            updateContact(toUpdate.getContactId(), contact);
        }
    }

}
