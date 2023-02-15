package exercise2;

import java.util.Scanner;

public class FilterStringArray {
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		String [] filterWords = new String[words.length];
		int index = 0;
		for(String s : words) {
			if(s.length() >= minLength) {
				filterWords[index] = s;
				index++;
			}
		}
		
		String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = filterWords[i];
        }
        return result;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		
		System.out.println("enter minimum length of string to filter words which were entered ");
		int minlength = sc.nextInt();
		
		String [] words = str.split(" ");
		
		String [] filterwords = filterWordsByLength(minlength, words);
		
		System.out.println("Words with length more or equal to " + minlength + ":");
        for (String word : filterwords) {
            System.out.println(word);
        }
		

	}

}
