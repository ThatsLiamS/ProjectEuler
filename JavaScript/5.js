/*
Task Five: Smallest Multiple

2520 is the smallest number that can be divided by
each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly
divisible by all of the numbers from 1 to 20?
*/

const isValidNumber = (number) => 
	[11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
		.every((factor) => number % factor === 0);

let number = 1;
while (true) {
	if (isValidNumber(number)) break;
	number++;
};

console.log(number);
