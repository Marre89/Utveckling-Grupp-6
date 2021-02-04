package se.yrgo.models;


public class ContactBook {
	/**
	 * @param  these tests compare two equal and two not equal contacts
	 * 
	 * */
	private Contact[] contactArray = new Contact[10];
	private int nextPosition = 0;

	public void showContacts() {
		for(int i = 0; i < nextPosition; i++) {
			System.out.println(contactArray[i] + "");
		}
	}
	
	public int getNumberOfContacts() {
		return nextPosition;
	}
	
	public void addContact(Contact newContact) {
		contactArray[nextPosition] = newContact;
		nextPosition++;
	}
	
	public Contact findContact(String name) throws ContactNotFoundException
	{
		name =name.trim();
		
		for (int counter = 0; counter < nextPosition; counter++) {
			if (contactArray[counter].getName().equalsIgnoreCase(name)) {
				return contactArray[counter];
			}
		}
		throw new ContactNotFoundException();
	}
	
	public Contact[] removeContact(String removeName) throws ContactNotFoundException
	{
		 removeName=removeName.trim();
		
		for (int counter = 0; counter < nextPosition; counter++) {
			if (contactArray[counter].getName().equalsIgnoreCase(removeName)) {
				for(int i = 0; i < nextPosition; i++) {
					contactArray[i] = contactArray[i + 1];
			
				}
				return  contactArray;
			}
		}
		throw new ContactNotFoundException();
	}
}
