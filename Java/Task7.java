/*
Task Seven: 10001st Prime

By listing the first six prime numbers: 2, 3, 5, 7,
11, and 13, we can see that the 6th prime is 13.

What is the 10,001st prime number?
*/

import java.util.ArrayList;
import java.util.List;

public class Task7 {

	public static boolean isPrime(int number) {
		if (number < 2) return false;
	
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) return false;
		};
	
		return true;
	};

	public static void main(String[] args) {

		List<Integer> primes = new ArrayList<>();

		int count = 1;
		while (primes.size() < 10_001) {
			if (isPrime(count) == true) primes.add(count);
			count++;
		};

		System.out.println(primes.get(10_000));

	};
};
