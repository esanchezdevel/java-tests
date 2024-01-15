package com.esanchez.devel.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {

	private static final String MALE = "male";
	private static final String FEMALE = "female";
	
	public static void main(String[] args) {
		// Create our list of persons
		List<Person> persons = Arrays.asList(
				new Person("Tom", MALE), 
				new Person("Peter", MALE), 
				new Person("Sophie", FEMALE), 
				new Person("John", MALE), 
				new Person("Anna", FEMALE));
		
		// Get only the males of the list
		List<Person> males = persons.stream()
				.filter(p -> p.getGender().equals(MALE))
				.collect(Collectors.toList());
		
		System.out.println("Result list: " + males);
		
		// Order the males list by name
		List<Person> malesSorted = males.stream()
				.sorted(Comparator.comparing(Person::getName))
				.collect(Collectors.toList());
		
		System.out.println("Result list: " + malesSorted);
		
		// Order the males list by name reversed
		List<Person> malesSortedReversed = males.stream()
				.sorted(Comparator.comparing(Person::getName).reversed())
				.collect(Collectors.toList());
		
		System.out.println("Result list: " + malesSortedReversed);
		
		// Get only the females and sort the result list in one single operation
		List<Person> femalesSorted = persons.stream()
				.filter(p -> p.getGender().equals(FEMALE))
				.sorted(Comparator.comparing(Person::getName))
				.collect(Collectors.toList());
		
		System.out.println("Result list: " + femalesSorted);
	}
	
	static class Person {
		
		private String name;
		private String gender;
		
		public Person(String name, String gender) {
			this.name = name;
			this.gender = gender;
		}

		public String getName() {
			return name;
		}

		public String getGender() {
			return gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
	}
}
