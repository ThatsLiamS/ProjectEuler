/*
Task Six: Sum Square Difference

The sum of the squares of the first ten natural numbers is,
	1^2 + 2^2 + ... + 10^2 = 385.

The square of the sum of the first ten natural numbers is,
	(1 + 2 + ... + 10)^2 = 55^2 = 3025.

Hence the difference between the sum of the squares of the first
ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first
one hundred natural numbers and the square of the sum.
*/

public class Task6 {

	public static int sumOfSquares(int number) {
		/* Sum of (1 to N)^2    ==>    [n(n+1)(2n+1)] / 6 */
		return ((number) * (number + 1) * (2 * number + 1)) / 6;
	};

	public static int sumOfNumbers(int number) {
		/* Sum of (1 to N)  =>  n(n+1) / 2 */
		return ((number) * (number + 1)) / 2;
	};

	public static void main(String[] args) {

		int numbersSum = sumOfNumbers(100);

		System.out.println(
			(numbersSum * numbersSum) - sumOfSquares(100)
		);

	};
};
