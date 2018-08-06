package com.training.filter;

import java.util.List;

public class OrCriteria implements ICriteria {
	private ICriteria firstCriteria;
	private ICriteria secondCriteria;

	public OrCriteria(ICriteria firstCriteria, ICriteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstList = firstCriteria.meetCriteria(persons);
		List<Person> secondList = firstCriteria.meetCriteria(persons);

		for (Person p : secondList) {
			if (!firstList.contains(p)) {
				firstList.add(p);
			}
		}
		
		//if used andAll typecast to set and override hashcode and equals in person class
		//or
		//firstList.addAll(secondList);
		return firstList;
	}

}
