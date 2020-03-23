package com.radnerus.combinatorpattern;

import static com.radnerus.combinatorpattern.CustomerRegistrationValidator.isAnAdult;
import static com.radnerus.combinatorpattern.CustomerRegistrationValidator.isEmailValid;
import static com.radnerus.combinatorpattern.CustomerRegistrationValidator.isPhoneNumberValid;

import java.time.LocalDate;

import com.radnerus.combinatorpattern.CustomerRegistrationValidator.ValidationResult;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(
				"Surendar", "surendarandyou@gmail.com", "+919003023621", LocalDate.of(1993, 11, 26)
		);

		// Normal Validation
		CustomerValidatorService validatorService = new CustomerValidatorService();

		boolean isValid = validatorService.isValid(customer);
		System.out.println(isValid);

		// Using Combinator
		ValidationResult result = isEmailValid().and(isPhoneNumberValid()).and(isAnAdult()).apply(customer);

		System.out.println(result);

		if(result != ValidationResult.SUCCESS ){
			throw new IllegalStateException(result.name());
		}
	}

}
