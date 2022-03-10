package main.java;

import java.util.*;

public class ExerciseClass {
	
	public Map<String, Integer> aboveBelow(int[] list, int x) {
		
		Map<String, Integer> aB = new HashMap<String, Integer>();
		int above = 0;
		int below = 0;
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] < x) {
				below++;
			} else if(list[i] > x) {
				above++;
			}
		}
		aB.put("above", above);
		aB.put("below", below);
		
		return aB;
	}
	
	public String stringRotation(String original, int x) {
		
		int r = x % original.length();
		
		return original.substring(original.length()-r, original.length()) + original.substring(0, original.length()-r);
	}

}
