"""
Task Seven: 10001st Prime

By listing the first six prime numbers: 2, 3, 5, 7,
11, and 13, we can see that the 6th prime is 13.

What is the 10,001st prime number?
"""

import math

def isPrime(number):
	if number < 2:
		return False
	
	upper_limit = int(math.sqrt(number))
	for i in range(2, upper_limit + 1):
		if number % i == 0:
			return False

	return True

primes = [2]

count = 3
while len(primes) < 10_001:
	if isPrime(count):
		primes.append(count)
	count += 2

print(primes[-1])
