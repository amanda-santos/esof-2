package br.com.mockito_example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StudentSearchTest {
	private static StudentService studentServiceTest;
	private static StudentSearch student;
	
	@BeforeAll
	public static void init() {
		studentServiceTest = mock(StudentService.class);
		Mockito.when(studentServiceTest.search(Mockito.anyInt())).thenReturn(StudentCONST.NULL);
		Mockito.when(studentServiceTest.search(122)).thenReturn(StudentCONST.MARY);
		student = new StudentSearch(studentServiceTest);
	}
	
	@Test
	public void testNullStudent() {
		String name = student.getStudent(1).getFirstName();
		assertEquals("NULL", name);
	}
	
	@Test
	public void testMaryStudent() {
		String name = student.getStudent(122).getFirstName();
		assertEquals("MARY STUART", name);
	}
}
