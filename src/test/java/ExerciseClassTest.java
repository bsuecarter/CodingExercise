package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.ExerciseClass;

class ExerciseClassTest {

	@Test
	void testAboveBelow() {
		
		ExerciseClass exerciseClass = new ExerciseClass();
		
		int[] test1 = {1, 5, 2, 1, 10};
		assertEquals("{below=4, above=1}", exerciseClass.aboveBelow(test1, 6).toString());
		
		int[] test2 = {6, 5, 2, 1, 10};
		assertEquals("{below=3, above=1}", exerciseClass.aboveBelow(test2, 6).toString());
		
		int[] test3 = {1, 5, 2, -1, 10}; //do negative values work?
		assertEquals("{below=4, above=1}", exerciseClass.aboveBelow(test3, 6).toString());
		
		int[] test4 = {1, 5, 2, -6, 10};
		assertEquals("{below=1, above=3}", exerciseClass.aboveBelow(test4, 1).toString());
		
		int[] test5 = {8, 5, 2, 6, 10}; // all above
		assertEquals("{below=0, above=5}", exerciseClass.aboveBelow(test5, 1).toString());
		
		int[] test6 = {8, 5, 2, 6, 10}; // all below
		assertEquals("{below=5, above=0}", exerciseClass.aboveBelow(test6, 11).toString());
		
		int[] test7 = {5, 5, 5, 5, 5}; // all the same
		assertEquals("{below=0, above=0}", exerciseClass.aboveBelow(test7, 5).toString());
		
	}
	
	@Test
	void testStringRotation() {
		
		ExerciseClass exerciseClass = new ExerciseClass();
		
		assertEquals("ngMyStri", exerciseClass.stringRotation("MyString", 2));
		
		assertEquals("ngMyStri", exerciseClass.stringRotation("MyString", 10));
		
		assertEquals("MyString", exerciseClass.stringRotation("MyString", 0));
		
		assertEquals("MyString", exerciseClass.stringRotation("MyString", 8));
		
	}
	

}
