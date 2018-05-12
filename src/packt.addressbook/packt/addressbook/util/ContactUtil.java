package packt.addressbook.util;

import java.util.*;
import packt.addressbook.model.*;

public class ContactUtil {
	public List<Contact> getContacts() {
		return Arrays.asList(
			new Contact("Edsger", "Dijkstra", "1234"),
			new Contact("Alan", "Turing", "4567")
		);
	}
}