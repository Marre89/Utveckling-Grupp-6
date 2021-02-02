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

}