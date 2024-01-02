/*
Task Four: Largest Palindrome Product

A palindromic number reads the same both ways. The largest palindrome
made from the product of two 2-digit numbers is 9009 = 91 * 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {

	public static boolean isPalindrome(int number) {
		String stringValue = String.valueOf(number);

		StringBuilder builder = new StringBuilder(stringValue);
		builder.reverse();

		return builder.toString().equals(stringValue);
	};

	public static void main(String[] args) {

		List<Integer> palindromes = new ArrayList<>();

		for (int outer = 100; outer < 999; outer++) {
			for (int inner = 100; inner < 999; inner++) {
		
				int value = outer * inner;
				if (isPalindrome(value)) palindromes.add(value);
			};
		};

		Collections.sort(palindromes, Collections.reverseOrder());
		System.out.println(palindromes.get(0));

	};
};
