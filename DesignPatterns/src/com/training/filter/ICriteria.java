package com.training.filter;

import java.util.List;

public interface ICriteria {
	public List<Person> meetCriteria(List<Person> persons);

	//public List<Person> meetFemaleCriteria(List<Person> persons);
}
