package com.radnerus.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person("Surendar", Gender.MALE), new Person("Yuvarani", Gender.FEMALE),
				new Person("Lithvick", Gender.MALE), new Person("Kamakshi", Gender.FEMALE),
				new Person("Vinayagamoorthy", Gender.MALE));

//		Imperative Approach
		List<Person> females = new ArrayList<>();

		for (Person person : people) {
			if (Gender.FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}

		System.out.println("Output : " + females);

		// Declarative Approach
		List<Person> females2 = people.stream().filter(person -> Gender.FEMALE.equals(person.gender)).collect(Collectors.toList());
		System.out.println(females2);

	}

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		MALE, FEMALE
	}

}
