package packt.addressbook.util;

import java.util.*;

public class SortUtil {
	public <T extends Comparable> List<T> sortList(List<T> list) {
		for(int outer = 0;outer < list.size() - 1;outer++) {
			for(int inner = 0;inner < list.size() - outer - 1;inner++ ) {
				swap(list, inner);
			}
		}
		return list;
	}

	private <T> void swap(List<T> list, int inner) {
		T temp = list.get(inner);
		list.set(inner,list.get(inner + 1));
		list.set(inner + 1, temp);
	}
}