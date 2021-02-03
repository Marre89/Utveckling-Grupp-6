package se.yrgo.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareContactTest {

	@Test
	public void CompareContactNullTest() {
		assertFalse(equals(null));
	}

	@Test
	public void CompareEquals() {
		Contact contact1 = new Contact("John", "Smith", "Jacobs gata 22", "072-22 49 16", "john@email.com");
		Contact contact2 = new Contact("John", "Smith", "Jacobs gata 22", "072-22 49 16", "john@email.com");
        assertEquals(contact1, contact2);
	}
	
	@Test
	public void CompareNotEquals() {
		Contact contact3 = new Contact("Bobby", "Wright", "Street 22", "072-11 49 16", "bob@email.com");
		Contact contact4 = new Contact("Bobby", "Write", "Street 22", "072-11 49 16", "bob@email.com");
        assertNotEquals(contact3, contact4);
	}	
	
}
