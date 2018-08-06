package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Male implements ICriteria {
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> male = new ArrayList<Person>();
		List<Person> male1 = new ArrayList<Person>();
		for (Person p : persons) {
			if (p.getSex().equals("male")) {
				male.add(p);
			}

		}
		return male;
	}

}
