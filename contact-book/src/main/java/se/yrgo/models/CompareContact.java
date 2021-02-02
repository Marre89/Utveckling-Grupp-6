package se.yrgo.models;

public class CompareContact extends Contact{
	public CompareContact(String name, String lastName, String address, String phoneNumber, String eMail) {
		super(name, lastName, address, phoneNumber, eMail);
		// TODO Auto-generated constructor stub
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(this == obj))
            return false;        
        Contact other = (Contact) obj;
        
        if (getName() == null) {
            if (other.getName() != null)
                return false;
        } else if (!getName().equals(other.getName()))
            return false;
        
        if (getPhoneNumber() == null) {
            if (other.getPhoneNumber() != null)
                return false;
        } else if (!getPhoneNumber().equals(other.getPhoneNumber()))
            return false;
        
       return true;       
	}
}
