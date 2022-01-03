package br.com.mockito_example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

/* Using the annotation Mock and InjectMocks, ExtendWith */

@ExtendWith(MockitoExtension.class)
public class StudentSearchTest4 {
	
	@Mock
	private StudentService studentServiceTest;
	@InjectMocks
	private StudentSearch student;
	
	@Test
	public void testNullStudent() {
		Mockito.when(studentServiceTest.search(Mockito.anyInt())).thenReturn(StudentCONST.NULL);
		String name = student.getStudent(1).getFirstName();
		assertEquals("NULL", name);
	}
	
	@Test
	public void testMaryStudent() {
		Mockito.when(studentServiceTest.search(122)).thenReturn(StudentCONST.MARY);
		String name = student.getStudent(122).getFirstName();
		assertEquals("MARY STUART", name);
	}
}
