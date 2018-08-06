package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> female = new ArrayList<Person>();
		for (Person p : persons) {
			if (p.getSex().equals("female")) {
				female.add(p);
			}
		}
		return female;
	}

	

}
