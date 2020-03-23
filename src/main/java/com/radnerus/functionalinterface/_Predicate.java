package com.radnerus.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		System.out.println("Without Predicate");
		System.out.println(isPhoneNumberValid("90013123"));
		System.out.println(isPhoneNumberValid("9003023621"));
		System.out.println(isPhoneNumberValid("8003023621"));
		
		System.out.println("With Predicate");
		System.out.println(isPhoneNumberValidPredicate.test("90013123"));
		System.out.println(isPhoneNumberValidPredicate.test("9003023621"));
		System.out.println(isPhoneNumberValidPredicate.test("8003023621"));
		
		System.out.println("Is phone number valid and contains 3 : " + isPhoneNumberValidPredicate.and(containsNumber3).test("9003023621"));
		
		System.out.println("Is phone number valid or contains 3 : " + isPhoneNumberValidPredicate.or(containsNumber3).test("9871210921"));
		
//		BiPredicate is Similar -> Takes 2 argument
	}
	
	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("9") && phoneNumber.length() == 10;

	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("9") && phoneNumber.length() == 10;
	}
	
	static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
