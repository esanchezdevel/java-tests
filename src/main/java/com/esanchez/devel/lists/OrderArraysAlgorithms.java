package com.esanchez.devel.lists;

import java.util.Arrays;

public class OrderArraysAlgorithms {

	private static final Integer[] ORIGINAL = {34, 67, 32, 77, 84, 11, 32, 12};
	
	public static void main(String[] args) {
		Integer[] result = basicOrderArray(ORIGINAL);
		
		System.out.print("Result: ");
		for (Integer elem : result) {
			System.out.print(elem + " | ");
		}
		
		System.out.println();
		
		result = orderWithLibrary(ORIGINAL);
		System.out.print("Result with library: ");
		for (Integer elem : result) {
			System.out.print(elem + " | ");
		}
		
		System.out.println();
		
		result = quickSortAlgorithm(ORIGINAL, 0, 7);
		System.out.print("Result with quick sort: ");
		for (Integer elem : result) {
			System.out.print(elem + " | ");
		}
	}
	
	private static Integer[] orderWithLibrary(Integer[] array) {
		Arrays.sort(array);
		return array;
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
	
	// Algorithm to order an array dividing in two the array and ordering each block by dividing again in 2.
	private static Integer[] quickSortAlgorithm(Integer[] array, int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(array, begin, end);

	        quickSortAlgorithm(array, begin, partitionIndex-1);
	        quickSortAlgorithm(array, partitionIndex+1, end);
	    }
	    return array;
	}
	
	private static int partition(Integer[] arr, int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}
}
