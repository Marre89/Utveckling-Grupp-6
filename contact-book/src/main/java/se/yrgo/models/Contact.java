package se.yrgo.models;

public class Contact extends CompareContact{
    private String name;
    private String address;
    private String phoneNumber;
    private String eMail;
    
    /**
     * @param Contact constructor creates a new contact object.
     * 
     * */

    public Contact(String name, String address, String phoneNumber, String eMail) {
    	super(name, eMail);
    	this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %s, %s", name, address, phoneNumber, eMail);
    }

}