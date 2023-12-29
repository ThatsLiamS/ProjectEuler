"""
Task Five: Smallest Multiple

2520 is the smallest number that can be divided by
each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly
divisible by all of the numbers from 1 to 20?
"""

def isValidNumber(number):
	for factor in [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]:
		if (number % factor != 0):
			return False
	return True

number = 1
while (True):
	if (isValidNumber(number)):
		break
	number += 1

print(number)
