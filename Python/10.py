"""
Task Ten: Summation of Primes

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
"""

from math import sqrt as squareRoot

def isPrime(number):

	upper_limit = int(squareRoot(number))
	for i in range(2, upper_limit + 1):
		if number % i == 0:
			return False

	return True

primes = 2
count = 3

while count < 2_000_000:
	if isPrime(count):
		primes += count
	count += 2

print(primes)
