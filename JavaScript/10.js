/*
Task Ten: Summation of Primes

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/

const isPrime = (number) => {
	for (let i = 2; i <= Math.sqrt(number); i++) {
		if (number % i === 0) return false;
	};

	return true;
};

let primes = 2
let count = 3;

while (count < 2_000_000) {
	if (isPrime(count) == true) {
		primes += count;
	};
	count += 2;
};

console.log(primes);
