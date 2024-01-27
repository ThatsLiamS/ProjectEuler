"""
Task Twenty: Factorial Digit Sum

n! means n * (n - 1) * ... * 3 * 2 * 1.

For example, 10! = 10 * 9 * ... * 3 * 2 * 1 = 3628800, and the
sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
"""

def factorial(num):
	if (num == 2):
		return 2
	return num * factorial(num - 1)

hundredFactorial = f'{factorial(100)}'

sum = 0
for digit in hundredFactorial:
	sum += int(digit)
print(sum)
