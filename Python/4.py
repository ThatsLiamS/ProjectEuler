"""
Task Four: Largest Palindrome Product

A palindromic number reads the same both ways. The largest palindrome
made from the product of two 2-digit numbers is 9009 = 91 * 99.

Find the largest palindrome made from the product of two 3-digit numbers.
"""

def isPalindrome(string):
	return string == string[::-1]

palindromes = []

for outer in range(100, 999):
	for inner in range(100, 999):

		if (isPalindrome( str(outer * inner) )):
			palindromes.append(outer * inner)

print( max(palindromes) )
