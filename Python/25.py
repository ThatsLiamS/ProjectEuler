"""
Task Twenty-Five: 1000-digit Fibonacci Number

The Fibonacci sequence is defined by the recurrence relation:
	Fn = F{n - 1} + F{n - 2}, where F1 = 1 and F2 = 1

Hence the first 12 terms will be:
	F1   = 1
	F2   = 1
	F3   = 2
	F4   = 3
	F5   = 5
	F6   = 8
	F7   = 13
	F8   = 21
	F9   = 34
	F10  = 55
	F11  = 89
	F12  = 144

The 12th term, F12, is the first term to contain three digits.
What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
"""

term = 2
DynamicProgramming = [1, 1]
while( len ( f'{DynamicProgramming[1]}' ) < 1_000 ):

	DynamicProgramming.append(
		DynamicProgramming[0] + DynamicProgramming[1]
	)

	DynamicProgramming.pop(0)
	term += 1

print(term)
