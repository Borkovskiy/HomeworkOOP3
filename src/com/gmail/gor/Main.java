package com.gmail.gor;

import com.gmail.gor.exceptions.NotEnoughSpaceException;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Андрей", "Захаров", Gender.MAN, 25, 123);
		Student student2 = new Student("Юрий", "Петров", Gender.MAN, 33, 1234);
		Student student3 = new Student("Сергей", "Иванов", Gender.MAN, 18, 12345);
		Student student4 = new Student("Наталия", "Коцюба", Gender.WOMAN, 24, 123456);
		Student student5 = new Student("Иван", "Арбузов", Gender.MAN, 30, 1234567);
		Student student6 = new Student("Иван", "Белов", Gender.MAN, 24, 12345678);
		Student student7 = new Student("Иван", "Козаков", Gender.MAN, 24, 123456689);
		Group group = new Group();
		group.setGroupName("курс 1");

		addStudent(student1, group);
		addStudent(student2, group);
		addStudent(student3, group);
		addStudent(student4, group);
		addStudent(student5, group);
		addStudent(student6, group);
		addStudent(student7, group);
		addStudent(student7, group);
		addStudent(student7, group);
		addStudent(student7, group);
		addStudent(student7, group);
		

		group.deleteStudent(123456689);

		searchStudent("Коцюба", group);
		searchStudent("sddsds", group);

		System.out.println(group);

	}

	public static void addStudent(Student st, Group group) {
		try {
			group.addStudent(st);
		} catch (NotEnoughSpaceException e) {
			System.out.println("the group is full");
		}
	}

	public static void searchStudent(String lastName, Group group) {
		if (group.searchStudent(lastName) != null) {
			System.out.println(group.searchStudent(lastName));
		} else {
			System.out.println("student is not in the group");
		}

	}
}
