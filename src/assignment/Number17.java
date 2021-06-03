package assignment;

import java.util.Scanner;

public class Number17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("type in a word");
		String e = input.nextLine();
		int e1 = 0;
		boolean palin = true;
		
		for(int i = e.length()-1; i >= e.length()/2; i--) {
			System.out.println(e.charAt(i) + " " + e.charAt(e1));
			if(e.charAt(i) != e.charAt(e1)) 
				palin = false;
			e1++;
		}
		if (palin) {
			System.out.println("Palindrome");
			}
			else 
				System.out.println("not a palindrome");
			
		input.close();
	}
}
