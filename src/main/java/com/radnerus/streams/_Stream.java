package com.radnerus.streams;

import java.util.List;
import java.util.function.Predicate;

public class _Stream {

	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person("Surendar", Gender.MALE), new Person("Yuvarani", Gender.FEMALE),
				new Person("Lithvick", Gender.MALE), new Person("Kamakshi", Gender.FEMALE),
				new Person("Vinayagamoorthy", Gender.MALE), new Person("Bob", Gender.PREFER_NOT_TO_SAY));

		// Function<? super Person, ? extends String> personNameFunction = person ->
		// person.name;
		// ToIntFunction<String> stringLength = String::length;
		// IntConsumer println = System.out::println;

		// people.stream()
		// .map(personNameFunction)
		// .mapToInt(stringLength)
		//// .collect(Collectors.toSet())
		// .forEach(println);;

		Predicate<? super Person> personPredicate = person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender);
		boolean containsOnlyFemales = people.stream().noneMatch(personPredicate);
		// anyMatch, allMatch, noneMtach

		System.out.println(containsOnlyFemales);
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
		MALE, FEMALE, PREFER_NOT_TO_SAY
	}

}
