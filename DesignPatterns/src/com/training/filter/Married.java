package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Married  implements ICriteria{
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> married = new ArrayList<Person>();
		for (Person p : persons) {
			if (p.getMaritalStatus().equals("married")) {
				married.add(p);
			}
		}
		return married;
	}
}
