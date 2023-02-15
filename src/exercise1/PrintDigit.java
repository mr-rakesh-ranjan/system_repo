package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number");
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		while(num > 0) {
			arr.add((num%10));
			num /= 10;
		}
		
		Collections.sort(arr);
		for(int c : arr) {
			System.out.println(c);
		}

		
		
		
		sc.close();
	}

}
