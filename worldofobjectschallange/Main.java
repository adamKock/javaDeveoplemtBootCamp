import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager(contactData());
        Scanner scan = new Scanner(System.in);

        // Display initial contacts
        displayContacts(contactManager);
        System.out.print("\nYou have 8 contacts. Enter 'continue' to edit them: ");
        String status = scan.nextLine();

        while (status.equals("continue")) {
            // Ask for index to edit
            System.out.print("\nChoose an index from 0 to 7: ");
            int index = scan.nextInt();
            scan.nextLine(); // Consume the leftover newline

            // Get updated contact from user input
            Contact editedContact = editedContact(scan);

            // Set the updated contact at the given index
            contactManager.setContact(editedContact, index);

            // Display updated contacts
            System.out.println("\n\nUPDATED CONTACTS\n\n");
            displayContacts(contactManager);

            // Ask if the user wants to continue
            System.out.print("Enter 'continue' to make more changes: ");
            status = scan.nextLine();
        }

        scan.close();
    }

    // Method to create an edited contact using user input
    public static Contact editedContact(Scanner scan) {
        System.out.print("\tName: ");
        String name = scan.nextLine();
        System.out.print("\tPhone Number: ");
        String phoneNumber = scan.nextLine();
        System.out.print("\tBirth Date (DD-MM-YYYY): ");
        String birthDate = scan.nextLine();

        return new Contact(name, phoneNumber, birthDate);  // Create and return new Contact object
    }

    // Initial contact data
    public static Contact[] contactData() {
        return new Contact[] {
            new Contact("John Doe", "555-123-4567", "01-01-1985"),
            new Contact("Jane Smith", "555-987-6543", "14-02-1990"),
            new Contact("Alice Johnson", "555-345-6789", "30-03-1975"),
            new Contact("Bob Brown", "555-567-8910", "25-12-2000"),
            new Contact("Charlie Davis", "555-111-2222", "04-07-1983"),
            new Contact("Diana White", "555-333-4444", "18-11-1997"),
            new Contact("Ethan Green", "555-555-6666", "22-05-1988"),
            new Contact("Fiona Black", "555-777-8888", "31-10-2002")
        };
    }

    // Method to display all contacts
    public static void displayContacts(ContactManager contactManager) {
        for (int i = 0; i < 8; i++) {
            Contact contact = contactManager.getContact(i);
            System.out.println(contact);
            System.out.println();
        }
    }
}
