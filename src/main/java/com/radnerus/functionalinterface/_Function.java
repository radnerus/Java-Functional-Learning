package com.radnerus.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {
		int increment = incrementByOne(1);
		System.out.println(increment);

		int increment2 = incrementByOneFunction.apply(1);
		System.out.println(increment2);

		int multiply = multiplyBy10Function.apply(increment2);
		System.out.println(multiply);

		Function<Integer, Integer> addByOneAndMultiplyByTen = incrementByOneFunction.andThen(multiplyBy10Function);

		Integer output = addByOneAndMultiplyByTen.apply(10);
		System.out.println("Function addByOneAndMultiplyByTen" + output);
		
		System.out.println("incremebtByOneAndMultiplyBiFunction 2, 10 : " + incremebtByOneAndMultiplyBiFunction.apply(2, 10));
		
		System.out.println("incrementByOneAndMultiply 2, 10 : " + incrementByOneAndMultiply(2, 10));
	}

	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

	static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

	static int incrementByOne(int number) {
		return number + 1;
	}

	static BiFunction<Integer, Integer, Integer> incremebtByOneAndMultiplyBiFunction = (numberToIncrementBy,
			numberToMultiplyBy) -> (numberToIncrementBy + 1) * numberToMultiplyBy;

	static int incrementByOneAndMultiply(int number, int numToMultiply) {
		return (number + 1) * numToMultiply;
	}
}
