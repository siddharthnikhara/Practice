package com.training.movieTweets;

public class Department {

	private int deptartmentId;

	private String deptName;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptartmentId, String deptName) {
		super();
		this.deptartmentId = deptartmentId;
		this.deptName = deptName;
	}

	public int getDeptartmentId() {
		return deptartmentId;
	}

	public void setDeptartmentId(int deptartmentId) {
		this.deptartmentId = deptartmentId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptartmentId=" + deptartmentId + ", deptName=" + deptName + "]";
	}


}
