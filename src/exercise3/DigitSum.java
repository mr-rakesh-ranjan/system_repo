package exercise3;

import java.util.Scanner;

public class DigitSum {
	
	public static int sumDigitsInPositiveNumber(int number) {
		int sum = 0;
		while(number > 0) {
			sum += number%10;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sumDigit = sumDigitsInPositiveNumber(num);
		System.out.println("The sum of all digits of " + num + " is : " + sumDigit);

	}

}
