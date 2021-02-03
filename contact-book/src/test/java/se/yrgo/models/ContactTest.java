package se.yrgo.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    public void test2EqualContacts() {
        Contact contact1 = new Contact("John", "Smith", "Jacobs gata 22", "072-22 49 16", "john@email.com");
        Contact contact2 = new Contact("John", "Smith", "Jacobs gata 22", "072-22 49 16", "john@email.com");
        assertEquals(contact1, contact2);
    }

    @Test
    public void test2NotEqualContacts() {
        Contact contact1 = new Contact("John", "Smith", "Jacobs gata 22", "072-22 49 16", "john@email.com");
        Contact contact2 = new Contact("Andrea", "Johnson", "Lindblads 4", "072-67 98 23", "andrea@email.com");
        assertNotEquals(contact1, contact2);
    }
    
    /**
     * @param These tests check different properties of a Contact class
     * */
	@Test
	public void testContactemail() {
		Contact email = new Contact("","","","","andrea@email.com");
		assertEquals("andrea@email.com", email.geteMail());
	}
	
	@Test
	public void testContactPhoneNumber() {
		Contact phoneNumber = new Contact("","","","072-22 49 16", "");
		assertEquals("072-22 49 16", phoneNumber.getPhoneNumber());
	}
	
	@Test
	public void testContactAddress() {
		Contact address = new Contact("","","Jacobs gata", "", "");
		assertEquals("Jacobs gata", address.getAddress());
	}
	
	@Test
	public void testContactLastName() {
		Contact johnson = new Contact("andrea", "johnson", "", "", "");
		assertEquals("johnson", johnson.getLastName());
	}
	
	@Test
    public void testContactName() {
        Contact andrea = new Contact("andrea", "andrea@mail.com", "", "", "");
        assertEquals("andrea", andrea.getName());
    }

}