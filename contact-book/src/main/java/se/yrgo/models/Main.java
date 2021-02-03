package se.yrgo.models;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		ContactBook cb = new ContactBook();
        Scanner scan = new Scanner(System.in);
        System.out.println("Vad vill du göra?");
        System.out.println("1. Hämta alla kontakter/2. Söka efter en kontakt/3. Skapa en ny kontakt/4. Ta bort en kontakt ");
        int choice = scan.nextInt();

        switch(choice){
            case 1:
                cb.getContactArray();    //This case is supposed to get all contacts.
                break;
            case 2:
                System.out.println("Ange namn på kontakt: ");   //This case is supposed to search for a contact.
                String searchName = scan.nextLine();
			try {
				System.out.println(cb.findContact(searchName));
			} catch (ContactNotFoundException e) {
				e.printStackTrace();
			}
                break;
            case 3:
                System.out.println("Förnamn: ");
                String name = scan.nextLine();						//Program asks for firstname and lastname at the same time when it runs. Don't know why.
                System.out.println("Efternamn: ");
                String lastName = scan.nextLine();
                System.out.println("Adress: ");
                String address = scan.nextLine();
                System.out.println("Telefonnummer: ");
                String phoneNumber = scan.nextLine();
                System.out.println("Mejl: ");
                String eMail = scan.nextLine();
                Contact newContact = new Contact(name, lastName, address, phoneNumber, eMail); //This 
                cb.addContact(newContact);
                cb.getContactArray();
                
                break;
            case 4:
            	System.out.println("Ange förnamnet på kontakten du vill ta bort");
            	String removeName = scan.nextLine();
			try {
				cb.removeContact(removeName);
			} catch (ContactNotFoundException e) {
				e.printStackTrace();
			}
                break;
            default:
                System.out.println("Jag vet inte vad du menar.");
            
        }
    }
}
