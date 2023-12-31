/*
Task Two: Even Fibonacci Numbers

Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and, 2 the first 10 terms will be:

	'1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...'

By considering the terms in the Fibonacci sequence whose values do not exceed four
million, find the sum of the even-valued terms.
*/

public class Task2 {
	public static void main(String[] args) {

		int sum = 0;
		int[] DynamicProgramming = {1, 2};

		while (DynamicProgramming[1] < 4_000_000) {

			if (DynamicProgramming[1] % 2 == 0) {
				sum += DynamicProgramming[1];
			};

			int nextTerm = DynamicProgramming[0] + DynamicProgramming[1];
			DynamicProgramming[0] = DynamicProgramming[1];
			DynamicProgramming[1] = nextTerm;
		};

		System.out.println(sum);

	};
};
