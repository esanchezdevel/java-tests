package com.esanchez.devel.lists;

import java.util.List;

public class ListNull {

	public static void main(String[] args) {
		
		List<String> myList = null;
		
		try {
			// The list is null, so a NullPointerException is throwed in the for
			for (String s : myList) {
				System.out.println("Enter in the for");
			}
		} catch (NullPointerException e) {
			System.out.println("A null pointer exception is throwed");
			e.printStackTrace();
		}
		System.out.println("Finish script");
	}
	
}
