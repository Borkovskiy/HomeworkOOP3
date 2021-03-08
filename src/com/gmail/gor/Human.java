package com.gmail.gor;

public class Human {
	private String name;
	private String lastName;
	private Gender gender;
	private int age;

	public Human(String name, String lastName, Gender gender, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human name=" + name + ", lastname=" + lastName + ", gender=" + gender + ", age=" + age;
	}

}
