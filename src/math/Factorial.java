package math;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

	public static void main(String[] args) {
		/*
		 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120. Write a java program to
		 * find Factorial of a given number using Recursion as well as
		 * Iteration.
		 *
		 */
		int i, j, num = 1;

		System.out.println("Enter an integer.");
		Scanner sc = new Scanner(System.in);

		i = sc.nextInt();

		if (i < 0)
			System.out.println("Interger can't be less than zero");
		else {
			for (j = 1; j <= i; j++)
				num = num * j;

			System.out.println("Factorial is: " + num);

		}
	}
}
