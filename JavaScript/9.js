/*
Task  Nine: Special Pythagorean Triplet

A Pythagorean triplet is a set of three natural numbers,
  a < b < c, for which,  a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2
There exists exactly one Pythagorean triplet for which a + b + c = 1000.

Find the product abc.
*/

const isValidTriplet = (a, b) => {
	const cSquared = (a ** 2) + (b ** 2);
	const c = Math.sqrt(cSquared);

	return (c % 1 == 0) ? c : false;
};

outerLoop: for (let a = 1; a < 1000; a++) {
	innerLoop: for (let b = 1; b < 1000; b++) {

		const c = isValidTriplet(a, b);
		if (c && (a + b + c) === 1000) {
			console.log(a * b * c);
			break outerLoop;
		};
	};
};
