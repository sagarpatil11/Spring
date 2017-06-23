package com.bridgeit.RestCrudeOp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.RestCrudeOp.Dao.StudentDao;
import com.bridgeit.RestCrudeOp.model.StudentModel;

@RestController
public class StudentController 
{
		@Autowired
		private StudentDao studentDao;
		
		@RequestMapping("/getstudent")
		public List<StudentModel> getStudent()
		{
			return studentDao.list();
		}
		
		@RequestMapping("/getstudentbyid/{sid}")
		public List<StudentModel> getStudentById(@PathVariable("sid") int sid)
		{	
			System.out.println(sid);
			List<StudentModel> list = new ArrayList();
			list.add(studentDao.get(sid));
			return list;
		}
		

		@RequestMapping(value="/addstudent",method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_VALUE})
		public List<StudentModel> addStudent(@RequestBody StudentModel s)
		{
			System.out.println(s.toString());
			return studentDao.addStudent(s);
		}
		
		@RequestMapping("/deletestudentbyid/{sid}")
		public List<StudentModel> deleteStudentById(@PathVariable("sid") int sid)
		{	
			System.out.println(sid);
			
			return studentDao.deletebyid(sid);
		}
		
		@RequestMapping(value="/updatestudent/{sid}",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
		public List<StudentModel> updateStudent(@PathVariable("sid") int sid,@RequestBody StudentModel student)
		{
			return studentDao.updateStudent(sid, student);
		}
		
}
