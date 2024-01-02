/*
Task Five: Smallest Multiple

2520 is the smallest number that can be divided by
each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly
divisible by all of the numbers from 1 to 20?
*/

public class Task5 {

	public static boolean isValidNumber(int number) {

		int[] factors = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		for (int index = 0; index < factors.length; index++) {

			if (number % factors[index] != 0) {
				return false;
			};
		};

		return true;
	};

	public static void main(String[] args) {

		int number = 1;
		while (true) {
			if (isValidNumber(number)) break;
			number++;
		};

		System.out.println(number);

	};
};
