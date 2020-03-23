package com.radnerus.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		Customer suren = new Customer("Surendar", "+91 900-302-3621");
		
		greetCustomer(suren);
		greetCustomerConsumer.accept(suren);
		
		greetCustomerV2(suren, true);
		greetCustomerV2(suren, false);
		greetCustomerConsumerV2.accept(suren, true);
		greetCustomerConsumerV2.accept(suren, false);
	}
	
	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println(
			"Hello " + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber  ? customer.customerPhoneNumber : "*** ***-***-****"));

	static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(
			"Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

	static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
		System.out.println(
				"Hello " + customer.customerName + ", thanks for registering phone number "
						+ (showPhoneNumber  ? customer.customerPhoneNumber : "*** ***-***-****"));
	}
	
	static void greetCustomer(Customer customer) {
		System.out.println(
				"Hello " + customer.customerName + ", thanks for registering phone number "
						+ customer.customerPhoneNumber);
	}

	static class Customer {
		private final String customerName;
		private final String customerPhoneNumber;

		public Customer(String customerName, String customerPhoneNumber) {
			super();
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}

	}

}
