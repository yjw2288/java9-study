package packt.addressbook.util;

import java.util.*;
import packt.addressbook.model.*;

public class ContactUtil {
	public List<Contact> getContacts() {
		return Arrays.asList(
			new Contact("Alan", "Turing", "4567"),
			new Contact("Edsger", "Dijkstra", "1234")
		);
	}
}