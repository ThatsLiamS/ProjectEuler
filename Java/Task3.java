/*
Task Three: Largest Prime Factor

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
*/

public class Task3 {

	public static Long largestPrimeFactor(Long number) {
		int factor = 2;
	
		while ((factor * factor) <= number) {
			if (number % factor == 0) number = number / factor;
			else factor += 1;
		};

		return number;
	};

	public static void main(String[] args) {

		System.out.println(
			largestPrimeFactor(600_851_475_143L)
		);

	};
};
