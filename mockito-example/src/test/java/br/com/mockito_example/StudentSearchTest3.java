package br.com.mockito_example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/* Using the annotation Mock InjectMocks */

public class StudentSearchTest3 {
	
	@Mock
	private StudentService studentServiceTest;
	private AutoCloseable closeService;
	@InjectMocks
	private StudentSearch student;
	
	@BeforeEach
	public void init() {
		closeService = MockitoAnnotations.openMocks(this);
		Mockito.when(studentServiceTest.search(Mockito.anyInt())).thenReturn(StudentCONST.NULL);
		Mockito.when(studentServiceTest.search(122)).thenReturn(StudentCONST.MARY);
	}
	
	@AfterEach
	public void closeService() throws Exception {
		closeService.close();
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
