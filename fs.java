using System;

class Program
{
	// First two values
	static int prev1 = 1;
	static int prev2 = 0;

	// Recursive function to print the Fibonacci series
	static void Fib(int n)
	{
		if (n < 3)
		{
			return;
		}
		int fn = prev1 + prev2;
		prev2 = prev1;
		prev1 = fn;
		Console.Write(fn + " ");
		Fib(n - 1);
	}

	// Function that handles the first two terms and calls the recursive function
	static void PrintFib(int n)
	{
		// When the number of terms is less than 1
		if (n < 1)
		{
			Console.WriteLine("Invalid number of terms");
		}
		// When the number of terms is 1
		else if (n == 1)
		{
			Console.WriteLine(0);
		}
		// When the number of terms is 2
		else if (n == 2)
		{
			Console.WriteLine("0 1");
		}
		// Number of terms greater than 2
		else
		{
			Console.Write("0 1 ");
			Fib(n);
		}
	}

	// Driver code
	static void Main()
	{
		int n = 9;

		// Function call
		PrintFib(n);
	}
}
