package ro.siit.java.pds;

public class ContactInfo {
    private String contactName;
    private Address address;
    private String phoneNumber;

    public ContactInfo(String contactName, Address address, String phoneNumber) {
        this.contactName = contactName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
