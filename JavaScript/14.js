/*
Task Fourteen: Longest Collatz Sequence

The following iterative sequence is defined for the set of positive integers:

	n -> n/2    (n is even)
	n -> 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
	13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it
has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1

Which starting number, under one million, produces the longest chain?
*/

const positions = {};
let max = 1;

for (let number = 1; number < 1_000_000; number++) {

	let currentNum = number;
	let routes = 1;

	while (currentNum != 1) {
		if (positions[currentNum] !== undefined) {
			routes = routes + positions[currentNum] - 1;
			break;
		};

		if (currentNum % 2 == 0) currentNum = currentNum / 2;
		else currentNum = (3 * currentNum) + 1;

		routes++;
	};

	positions[number] = routes;
	max = (positions[number] > positions[max]) ? number : max;
};

console.log(max);
