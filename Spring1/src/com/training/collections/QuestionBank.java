package com.training.collections;

import java.util.List;

public class QuestionBank {
	private String questions;
	private List<String> options;

	public QuestionBank() {
		// TODO Auto-generated constructor stub
	}

	public QuestionBank(String questions, List<String> options) {
		super();
		this.questions = questions;
		this.options = options;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "QuestionBank [questions=" + questions + ", options=" + options + "]";
	}

}
