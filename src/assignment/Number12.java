package assignment;

import java.util.Scanner;

public class Number12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("type sentence with spaces in front and behind");
		String e = input.nextLine();
//		input.nextLine();
		e = e.trim();
		String e1 = e.replaceAll(" ","");
		System.out.println(e);
		System.out.println(e1);
		
		input.close();
	}
}
