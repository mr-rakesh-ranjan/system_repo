package exercise3;

import java.util.Scanner;

public class GreatestCommonDivisor {
	
	private static int gcdRecursive(int a, int b) {
		if (b != 0)	{
				return gcdRecursive(b, a % b);
		} else
            return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers(Integer type) separated by space");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = gcdRecursive(a,b);
		System.out.println("The greatest commom divisor of " + a + " and " + b + " is " + gcd);
		sc.close();
	}

	

}
