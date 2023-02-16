package exercise4;

import java.util.Scanner;

public class TurnFirstLetterToCaps {
	
	public static String firstCharToTitleCase(String string) { 
		StringBuilder sb = new StringBuilder();
        String[] words = string.split(" ");
        for (String word : words) {
            if (word.length() > 0) {
                String lowerCaseWord = word.toLowerCase();
                char firstChar = Character.toUpperCase(lowerCaseWord.charAt(0));
                sb.append(firstChar);
                sb.append(lowerCaseWord.substring(1));
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String text = sc.nextLine();
		String capitalText = firstCharToTitleCase(text);
		System.out.println(capitalText);
		sc.close();

	}

}
