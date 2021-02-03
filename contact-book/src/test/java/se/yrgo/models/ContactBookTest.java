package se.yrgo.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContactBookTest {

	private ContactBook cb;
	private Contact contact1;

	public ContactBookTest() {
		cb = new ContactBook();
		Contact contact1 = new Contact("Eva", "Andersson", "", "", "");
		cb.addContact(contact1);
	}

	@Test
	public void shouldAddContact() {
		ContactBook cb = new ContactBook();
		Contact contact1 = new Contact("Eva", "Andersson", "", "", "");
		cb.addContact(contact1);
		assertEquals(1, cb.getNumberOfContacts());
	}

	@Test
	public void shouldFindContact() {
		cb = new ContactBook();
		Contact contact1 = new Contact("Eva", "Andersson", "", "", "");
		try {
			assertEquals(cb.findContact("Eva"), contact1.getName());
		} catch (ContactNotFoundException e) {

			e.printStackTrace();
		}
	}

	@Test
	public void shouldIgnoreCase() {
		cb = new ContactBook();
		Contact contact1 = new Contact("Eva", "Andersson", "", "", "");
		try {
			assertEquals(contact1.getName().toUpperCase(), cb.findContact("Eva"));
		} catch (ContactNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void shouldIgnoreExtraSpaces() {
		cb = new ContactBook();
		Contact contact1 = new Contact("Eva", "Andersson", "", "", "");
		try {
			assertEquals(contact1.getName().trim(), cb.findContact("Eva"));
		} catch (ContactNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void shouldRemoveContact() {
		ContactBook cb = new ContactBook();
		Contact contact1 = new Contact("Eva", "Andersson", "", "", "");
		cb.addContact(contact1);
		try {
			cb.removeContact("Eva");
		} catch (ContactNotFoundException e) {
			e.printStackTrace();
		}
		assertEquals(0, cb.getNumberOfContacts());
	}
}
