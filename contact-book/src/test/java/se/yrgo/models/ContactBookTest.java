package se.yrgo.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class ContactBookTest {
	/**
	 * @param  these tests compare two equal and two not equal contacts
	 * 
	 * */

	private ContactBook cb;
	
	public ContactBookTest() {
		cb = new ContactBook();
	}

	@Test
	public void shouldAddContact() {
		ContactBook cb = new ContactBook();
		Contact contact1 = new Contact("Eva Andersson","","","");
		cb.addContact(contact1);
		assertEquals(1, cb.getNumberOfContacts());
	}

	@Test
	public void shouldFindContact() {
		try {
		cb = new ContactBook();
			Contact contact1 = new Contact("Eva Andersson", "", "", "");
			assertEquals(cb.findContact("Eva Andersson"), contact1.getName());
		} catch (ContactNotFoundException e) {
				e.getStackTrace();
			}
	}

	@Test
	public void shouldIgnoreCase() {
		try {
			cb = new ContactBook();
			Contact contact1 = new Contact("EvA ANdErSson", "", "", "");
			cb.addContact(contact1);
			assertNotNull(cb.findContact("eva andersson"));
		} catch (ContactNotFoundException e) {
				e.getStackTrace();
			}
	}

	@Test
	public void shouldIgnoreExtraSpaces() throws ContactNotFoundException {
		try {
			cb = new ContactBook();
			Contact contact1 = new Contact("Eva Andersson","","", "");
			assertEquals(contact1, cb.findContact("  Eva Andersson    "));
		} catch (ContactNotFoundException e) {
				e.getStackTrace();
			}
	}
	
	@Test
	public void removeContactTest() {
			Contact contact1 = new Contact("Eva Andersson", "", "", "");
			cb.addContact(contact1);
			assertEquals(1, cb.getNumberOfContacts());
}
	@Test
	public void contactNotFoundExeptionTest() {
		assertThrows(ContactNotFoundException.class, () -> {
			cb.findContact("Troj");
		});
	}
	
}
