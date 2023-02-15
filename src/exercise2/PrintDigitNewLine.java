package exercise2;

import java.util.Scanner;

public class PrintDigitNewLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number");
		int num = sc.nextInt();
		String num1 = Integer.toString(num);
		for(int i = 0 ; i < num1.length(); i++) {
			System.out.println(num1.charAt(i));
		}
		

	}

}
