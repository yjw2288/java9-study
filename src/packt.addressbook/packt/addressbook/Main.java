package packt.addressbook;

import java.util.*;
import packt.addressbook.util.*;
import packt.addressbook.model.*;

public class Main {
	public static void main(String... args) {
		List<Contact> contacts = new ContactUtil().getContacts();
		System.out.println(contacts);
		List<Contact> sortedContacts = new SortUtil().sortList(contacts);
		System.out.println(sortedContacts);
	}
}