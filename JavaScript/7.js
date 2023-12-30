/*
Task Seven: 10001st Prime

By listing the first six prime numbers: 2, 3, 5, 7,
11, and 13, we can see that the 6th prime is 13.

What is the 10,001st prime number?
*/

const isPrime = (number) => {
	if (number < 2) return false;

	for (let i = 2; i <= Math.sqrt(number); i++) {
		if (number % i === 0) return false;
	};

	return true;
};

const primes = [];

let count = 1;
while (primes.length < 10_001) {
	if (isPrime(count) == true) {
		primes.push(count);
	};
	count++;
};

console.log( primes[primes.length - 1] );
