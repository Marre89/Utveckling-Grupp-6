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
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompareContact other = (CompareContact) obj;
		if (eMail == null) {
			if (other.eMail != null)
				return false;
		} else if (!eMail.equals(other.eMail))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/*This hashcode() & equals() method only checks for the first name, last name and the email. 
	//More should not be necessary as that would imply a faulty database.
	*/

}
