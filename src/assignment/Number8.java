package assignment;

import java.util.Scanner;

public class Number8 {

	public static void main(String[] args) {
		
		int cVowels = 0;
		int cConsonants = 0;
		int cDigits = 0;
		int cSpaces = 0;
				
		Scanner userInput = new Scanner(System.in);
		System.out.println("type a sentence");
		String str = userInput.nextLine();
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
					|| str.charAt(i) == 'i')
				cVowels++;
			
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
				cConsonants++;
			else if (Character.isDigit(str.charAt(i)))
				cDigits++;
			else if (Character.isWhitespace(str.charAt(i)))
				cSpaces++;
			else 
				continue;
		}
		System.out.println("Vowels: " + cVowels + "\nConsonants: " + cConsonants + "\nDigits: " +
		 cDigits + "\nSpaces: " + cSpaces);
		userInput.close();
	}
}
