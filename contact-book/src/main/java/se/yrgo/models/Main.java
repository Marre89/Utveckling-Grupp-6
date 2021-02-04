package se.yrgo.models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/**
		 * @param  these tests compare two equal and two not equal contacts
		 * 
		 * */
		ContactBook cb = new ContactBook();
        Scanner scan = new Scanner(System.in);
        
        int choice = 0;
        try{
        	do {
        
            System.out.println("What do you want to do?");
            System.out.printf("1.List Contacts %n2.Find Contact %n3.Add New Contact %n4.Delete Contact %n5.Exit%n");
            choice = scan.nextInt();
            
            switch(choice) {
            	case 1:
            		System.out.println("All Contacts:");
            		cb.showContacts();    //This case is supposed to get all contacts.
                break;
            	case 2:
            		System.out.println("Please enter Fullname of the contact you are looking for: ");
            		scan.skip("\r\n");
            		String searchName = scan.nextLine();
            		try {
            			System.out.println(cb.findContact(searchName));
            		} catch (ContactNotFoundException e) {
            			System.out.println("Contact does not exist.");
            		}
                break;
            	case 3:
            		System.out.println("Please enter the full name: ");
                		scan.skip("\r\n");
                		String name = scan.nextLine();						
                	System.out.println("Please enter an adress: ");
                		String address = scan.nextLine();
                	System.out.println("Please enter a phone number: ");
                		String phoneNumber = scan.nextLine();
                	System.out.println("Please enter an email: ");
                		String eMail = scan.nextLine();
                		Contact newContact = new Contact(name, address, phoneNumber, eMail);
                		cb.addContact(newContact);
                		System.out.println("Contact added.");
                
                break;
            	case 4:
            		System.out.println("Please enter the fullname of the contact you want to delete");
            		scan.skip("\r\n");
            		String removeName = scan.nextLine();
            		try {
            			cb.removeContact(removeName);
            			System.out.println("Contact deleted");
            		} catch (ContactNotFoundException e) {
            			System.out.println("Contact does not exist.");
            		}
                break;
            	case 5:
            		System.exit(1);
            	default:
            		System.out.println("Not a valid option");
                break;
            }
            
        }while (choice != 0);
        } catch (InputMismatchException e) {
        	System.out.println("not valid input");
        }
     }
}

