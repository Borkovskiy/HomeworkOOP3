package com.gmail.gor;



import com.gmail.gor.exceptions.NotEnoughSpaceException;

public class Group {
	private Student[] students = new Student[10];
	private String groupName;

	public Group(Student[] students, String groupName) {
		super();
		this.students = students;
		this.groupName = groupName;
	}

	public Group() {
		super();
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudens(Student[] students) {
		this.students = students;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student st) throws NotEnoughSpaceException {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = st;
				students[i].setGroup(groupName);
				count++;
				break;
			}
		}
		if (count == 0)
			throw new NotEnoughSpaceException();
	}

	public void deleteStudent(long id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getId() == id) {
				students[i] = null;
			}
		}
	}

	public Student searchStudent(String lastName) {
		for (Student student : students) {
			if (student != null && student.getLastName().equalsIgnoreCase(lastName)) {
				return student;

			}
		}
		return null;
	}

	@Override
	public String toString() {
		for (int i = 0; i < students.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < students.length; j++) {
				if (students[minIndex] != null && students[j] != null) {
					int a = students[minIndex].getLastName().compareTo(students[j].getLastName());
					if (a > 0) {
						minIndex = j;
					}
				}

			}
			if (minIndex != i) {
				Student temp = students[i];
				students[i] = students[minIndex];
				students[minIndex] = temp;
			}
		}
		String string = "Group- " + groupName + System.lineSeparator();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				string += students[i] + System.lineSeparator();
			}
		}
		return string;
	}

}
