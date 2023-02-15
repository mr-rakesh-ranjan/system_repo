package exercise2;

import java.util.Scanner;

public class CalculateAmountInString {
	
	public static int calculateAmountInString(String str) {
		int amount = 1;
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				amount++;
			}
		}
		return amount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String userString = sc.nextLine(); 
		sc.close();
		System.out.println(calculateAmountInString(userString));

	}

}
