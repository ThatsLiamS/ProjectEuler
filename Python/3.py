"""
Task Three: Largest Prime Factor

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
"""

def largest_prime_factor(number):
	factor = 2
	
	# keep dividing the number by a prime factor until it becomes 1
	while ((factor * factor) <= number):
		if number % factor == 0:
			number = number // factor
		else:
			factor += 1

	return number

print( largest_prime_factor(600_851_475_143) )
