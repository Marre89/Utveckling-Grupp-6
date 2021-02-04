package se.yrgo.models;

public class ContactBook {
	
	/**
	 * @param creates an empty array list with 10 available slots for contacts.
	 * 
	 */

	private Contact[] contactArray = new Contact[10];
	private int nextPosition = 0;
	
	/**
	 * @param returns list of all existing contacts.
	 * 
	 * */

	public void showContacts() {
		for (int i = 0; i < nextPosition; i++) {
			System.out.println(contactArray[i] + "");
		}
	}
	

	public int getNumberOfContacts() {
		return nextPosition;
	}

	/**
	 * @param adds contact to the ContactBook.
	 * 
	 * */
	
	public void addContact(Contact newContact) {
		contactArray[nextPosition] = newContact;
		nextPosition++;
	}

	/**
	 * @param Looks for contact in the ContactBook by the first name.
	 * @throws ContactNotFoundException if there's no match with any existing name in the ContactBook.
	 * 		 
	 * */
	
	public Contact findContact(String name) throws ContactNotFoundException {
		name = name.trim();

		for (int counter = 0; counter < nextPosition; counter++) {
			if (contactArray[counter].getName().equalsIgnoreCase(name)) {
				return contactArray[counter];
			}
		}
		throw new ContactNotFoundException();
	}

	/**
	 * @param Deletes a contact from the ContactBook by the first name.
	 * @throws ContactNotFoundException if there's no match with any existing name in the ContactBook.
	 * 
	 * */
	
	public Contact[] removeContact(String removeName) throws ContactNotFoundException {
		removeName = removeName.trim();

		for (int counter = 0; counter < nextPosition; counter++) {
			if (contactArray[counter].getName().equalsIgnoreCase(removeName)) {
				for (int i = 0; i < nextPosition; i++) {
					contactArray[i] = contactArray[i + 1];

				}
				return contactArray;
			}
		}
		throw new ContactNotFoundException();
	}
}
