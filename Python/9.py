"""
Task Nine: Special Pythagorean Triplet

A Pythagorean triplet is a set of three natural numbers,
  a < b < c, for which,  a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2
There exists exactly one Pythagorean triplet for which a + b + c = 1000.

Find the product abc.
"""

from math import sqrt as squareRoot

def isValidTriplet (a, b):
	cSquared = (a ** 2) + (b ** 2)
	c = squareRoot(cSquared)

	return c if (c % 1 == 0) else False

solved = False
for a in range (1, 1000):
	for b in range(1, 1000):

		c = isValidTriplet(a, b)
		if (c and (a + b + c) == 1000):
			print( f'{a * b * c:.0f}' )

			solved = True
			break
	if (solved):
		break
