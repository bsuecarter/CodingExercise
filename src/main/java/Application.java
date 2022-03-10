package main.java;

public class Application {

	public static void main(String[] args) {
		ExerciseClass test = new ExerciseClass();
		
		int[] list = {1, 5, 2, 1, 10};
		System.out.println(test.aboveBelow(list, 6));
		
		int[] list2 = {6, 5, 2, 1, 10};
		System.out.println(test.aboveBelow(list2, 6));
		
		System.out.println(test.stringRotation("MyString", 2));
		System.out.println(test.stringRotation("MyString", 10));
	}

}
