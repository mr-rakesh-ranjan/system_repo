package exercise1;

import java.util.Scanner;


public class SplitWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any text: ");
		String text = sc.nextLine();
		String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");
		System.out.println("Array of words: ");
		for (String word : words) {
			System.out.println(word);
		}
		sc.close();
  }
}


//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String str = sc.nextLine();
//
//		String [] arr = str.split("")
//
//	}

//}
