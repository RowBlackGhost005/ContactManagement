package data;

/**
 * Developed By: Luis Marin
 */
public class Contact {

    private int contactId;
    private String name;
    private String phoneNumber;
    private String email;
    private String contactType;

    public Contact(int contactId, String name, String phoneNumber, String email, String contactType) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.contactType = contactType;
    }

    public Contact(){
        this.contactId = 0;
        this.name = null;
        this.phoneNumber = null;
        this.email = null;
        this.contactType = null;
    }

    public int getContactId() {
        return this.contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getContactType() {
        return this.contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

}
