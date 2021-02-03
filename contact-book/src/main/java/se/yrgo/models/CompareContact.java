package se.yrgo.models;

public class CompareContact extends Contact{
	public CompareContact(String name, String lastName, String address, String phoneNumber, String eMail) {
		super(name, lastName, address, phoneNumber, eMail);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
	    int result = 1;
	    result = prime * result + ((geteMail() == null) ? 0 : geteMail().hashCode());
	    result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
	    return result;
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
        
        if (geteMail() == null) {
            if (other.geteMail() != null)
                return false;
        } else if (!geteMail().equals(other.geteMail()))
            return false;
        
       return true;       
	}
}
