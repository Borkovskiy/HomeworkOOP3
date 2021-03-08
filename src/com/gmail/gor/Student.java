package com.gmail.gor;

public class Student extends Human {
	private long id;
	private String group;

	public Student(String name, String lastName, Gender gender, int age, long id) {
		super(name, lastName, gender, age);
		this.id = id;

	}

	public Student() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", group=" + group + ", " + super.toString() + "]";
	}

}
