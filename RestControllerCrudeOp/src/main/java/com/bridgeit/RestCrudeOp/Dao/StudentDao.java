package com.bridgeit.RestCrudeOp.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bridgeit.RestCrudeOp.model.StudentModel;

@Repository
public class StudentDao 
{
	private static List<StudentModel> student;
	
	static{
		student=dummyStudent();
	}
	
	private static List<StudentModel> dummyStudent()
	{
		List<StudentModel> student=new ArrayList();
		student.add(new StudentModel(101, "sagar", "dhule","7845123654"));
		student.add(new StudentModel(102, "tushar", "pune","8789456523"));
		student.add(new StudentModel(103, "Alkesh", "nasik","9987453654"));
		return student;
		
	}
	
	public List<StudentModel> list()
	{
		return student;
	}
	
	public StudentModel get(int sid)
	{
		for(StudentModel s:student)
		{
			if(s.getS_id()==sid)
			{
				return s;
			}
		}
		return null;
		
	}
	
	public List<StudentModel> deletebyid(int sid)
	{
		for(StudentModel s:student)
		{
			if(s.getS_id()==sid)
			{
				student.remove(s);
				return list();
			}
		}
		return null;
	}
	
	public List<StudentModel> addStudent(StudentModel student)
	{
		this.student.add(student);
		return list();
	}
	
	public List<StudentModel> updateStudent(int sid,StudentModel s)
	{
		for(StudentModel st:student)
		{
			if(st.getS_id()==sid)
			{
				s.setS_id(st.getS_id());
				student.remove(st);
				student.add(s);
				return list();
			}
		}
		return null;
	}
}
