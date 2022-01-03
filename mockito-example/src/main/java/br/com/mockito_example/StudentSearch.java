package br.com.mockito_example;

import org.json.JSONObject;

public class StudentSearch {
	private StudentService studentService;
	
	public StudentSearch(StudentService service) {
		studentService = service;
	}
	
	public Student getStudent(int studentID) {
		String studentInfo = studentService.search(studentID);
		JSONObject studentJson = new JSONObject(studentInfo);
		String studentName = (String)studentJson.get("firstName");
		
		return new Student(studentName);
	}
}
