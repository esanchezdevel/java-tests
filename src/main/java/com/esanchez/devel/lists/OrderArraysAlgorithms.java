package com.esanchez.devel.lists;

public class OrderArraysAlgorithms {

	private static final Integer[] ORIGINAL = {34, 67, 32, 77, 84, 11, 32, 12};
	
	public static void main(String[] args) {
		Integer[] result = basicOrderArray(ORIGINAL);
		
		System.out.print("Result: ");
		for (Integer elem : result) {
			System.out.print(elem + " | ");
		}
	}
	
	private static Integer[] basicOrderArray(Integer[] array) {
		Integer[] result = array;
		
		int size = array.length;
		
		boolean changes = true;
		
		while (changes) {
			int changesDone = 0;
			
			Integer[] intermediate = result;
			result = new Integer[8];
			
			for (int i = 0; i < size; i++) {
				if (result[0] == null) {
					System.out.println("First element " + intermediate[i]);
					result[0] = intermediate[i];
					continue;
				}

				if (intermediate[i] < result[i - 1]) {
					System.out.println(intermediate[i] + " is lower than " + result[i - 1]);
					result[i] = result[i - 1];
					result[i - 1] = intermediate[i];
					changesDone++;
					continue;
				} else {
					System.out.println(intermediate[i] + " is bigger or equals than " + result[i - 1]);
					result[i] = intermediate[i];
					continue;
				}
			}

			if (changesDone == 0)
				changes = false;
		}
		return result;
	}
}
