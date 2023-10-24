package com.esanchez.devel.validations;

import java.util.UUID;

public class UUIDValidation {

	public static void main(String[] args) {
		
		System.out.println("isValid: " + validateUUID("b4bd2aea-7275-11ee-b962-0242ac120002"));
		System.out.println("isValid: " + validateUUID("5533d9ee-08ec-4dde-b335-af2bb07272fa"));
		System.out.println("isValid: " + validateUUID("other-value"));
		System.out.println("isValid: " + validateUUID("5533d9ee-08ec-4dde-af2bb07272fa"));
	}

	private static boolean validateUUID(String value) {
		boolean isValid = false;
		try {
		    UUID.fromString(value);
		    System.out.println(value + " is a valid UUID value");
		    isValid = true;
		} catch (IllegalArgumentException e) {
		    System.out.println("Error. " + value + " is not a valid UUID value");
		}
		return isValid;
	}
}
