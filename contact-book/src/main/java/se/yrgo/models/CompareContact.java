package se.yrgo.models;

public abstract class CompareContact {
	private String name;
	private String lastName;
	private String eMail;
	
	public CompareContact(String name, String lastName, String eMail) {
		this.name = name;
		this.lastName = lastName;
		this.eMail = eMail;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
	    int result = 1;
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
	    result = prime * result + ((lastName == null) ? 0 : name.hashCode());
	    result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
	    return result;
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(this == obj))
            return false;        
        Contact other = (Contact) obj;
        
        if (name == null) {
            if (other.getName() != null)
                return false;
        } else if (!name.equals(other.getName()))
            return false;
        
        if (lastName == null) {
            if (other.getLastName() != null)
                return false;
        } else if (lastName.equals(other.getLastName()))
            return false;
        
        if (eMail == null) {
            if (other.geteMail() != null)
                return false;
        } else if (!eMail.equals(other.geteMail()))
            return false;
        
       return true;       
	}
}
