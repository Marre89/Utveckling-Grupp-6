package se.yrgo.models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ContactBook cb = new ContactBook();
        Scanner scan = new Scanner(System.in);
        
        int choice;
        try{
        	do {
        
            System.out.println("What do you want to do?");
            System.out.println("1. List Contacts/2.Find Contact/3. Add New Contact/4. Delete Contact ");
            choice = scan.nextInt();
            
            switch(choice){
            	case 1:
            		cb.showContacts();    //This case is supposed to get all contacts.
                break;
            	case 2:
            		System.out.println("Please enter the first name of the contact you are looking for: ");
            		scan.skip("\r\n");
            		String searchName = scan.nextLine();
            		try {
            			System.out.println(cb.findContact(searchName));
            		} catch (ContactNotFoundException e) {
            			System.out.println("Contact does not exist.");
            		}
                break;
            	case 3:
            		System.out.println("Please enter the first name: ");
                		scan.skip("\r\n");
                		String name = scan.nextLine();						//Program asks for firstname and lastname at the same time when it runs. Don't know why.
                	System.out.println("Please enter the last name: ");
                		String lastName = scan.nextLine();
                	System.out.println("Please enter an adress: ");
                		String address = scan.nextLine();
                	System.out.println("Please enter a phone number: ");
                		String phoneNumber = scan.nextLine();
                	System.out.println("Please enter an email: ");
                		String eMail = scan.nextLine();
                		Contact newContact = new Contact(name, lastName, address, phoneNumber, eMail);
                		cb.addContact(newContact);
                		System.out.println("Contact added.");
                
                break;
            	case 4:
            		System.out.println("Please enter the first name of the contact you want to delete");
            		scan.skip("\r\n");
            		String removeName = scan.nextLine();
            		try {
            			cb.removeContact(removeName);
            			System.out.println("Contact deleted");
            		} catch (ContactNotFoundException e) {
            			System.out.println("Contact does not exist.");
            		}
                break;
            	default:
            		System.out.println("Bro, wtf!.");
                break;
            }
            
        }while (choice != 0);
        } catch (InputMismatchException e) {
        	System.out.println("Bro, wtf?");
        }
     }
}

