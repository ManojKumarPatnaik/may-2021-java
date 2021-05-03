package com.org;

public class TestMarks {
	public static void main(String[] args) {
		int[] marks = {75, 80, 70};
		// array starts from 0th index, it has length property
		System.out.println("Size: "+marks.length);
		for(int i = 0; i < marks.length; i++) { // i < 3
			System.out.println("marks: "+marks[i]); // i = 2, marks[2]
		}
	}
}
