package se.yrgo.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	public void test() {
	    Contact contact = new Contact("John", "Johnsson", "Jacobs gata 22", "072-22 49 16", "john@email.com");
	}
//	(String name, String lastName, String address, int phoneNumber, String eMail)
}
