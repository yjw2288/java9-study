package packt.addressbook.model;

public class Contact implements Comparable<Contact> {
	private String firstName;
	private String lastName;
	private String phoneNumber;

	public Contact(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return this.lastName + " " + this.phoneNumber;
	}

	public int compareTo(Contact otherContact) {
		return this.lastName.compareTo(otherContact.lastName);
	}
}