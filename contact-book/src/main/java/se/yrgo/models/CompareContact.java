package se.yrgo.models;

public abstract class CompareContact {
	private String name;
	private String eMail;
	
	/**
	 * @param  Here we have a hashCode() method and equals() method
	 * 
	 * */
	
	public CompareContact(String name, String eMail) {
		this.name = name;
		this.eMail = eMail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/** 
	 * This hashCode() & equals() method only checks for the and name email.
	 * More should not be necessary as that would imply a faulty database.
	 */
	
	

}
