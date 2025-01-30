package com.cjc.servicei;

import com.cjc.model.Student;

public interface ServiceI {



	public Student findByRollno(int rollno);

	public void saveData(Student s1); 
}
