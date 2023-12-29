/*
Task Four: Largest Palindrome Product

A palindromic number reads the same both ways. The largest palindrome
made from the product of two 2-digit numbers is 9009 = 91 * 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

const isPalindrome = (number) => {
	const string = String(number)
	return string == string.split('').reverse().join('');
};

const palindromes = []

for (let outer = 100; outer < 999; outer++) {
	for (let inner = 100; inner < 999; inner++) {

		const value = outer * inner;
		if (isPalindrome(value)) palindromes.push(value);
	};
};

const sorted = palindromes.sort((a, b) => b - a);
console.log( sorted[0] );
