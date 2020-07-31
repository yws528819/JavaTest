package com.yws.pattern.prototype;

public class Student implements Cloneable{
	private String name;

	private Teacher teacher;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Teacher getTeacher() {
		return teacher;
	}



	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {

		Student student = (Student) super.clone();
		
		Teacher teacher = (Teacher) this.teacher.clone();
		
		student.setTeacher(teacher);
		
		return student;
	}
	
	
}
