package assignment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Number10 {

	public static void main(String[] args) {
		
		int countWords = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter words");
		String str = input.nextLine();
		
		StringTokenizer st1 = new StringTokenizer(str," ");
		while(st1.hasMoreTokens()) {
			countWords++;
			st1.nextToken();
		}
		System.out.println(countWords);
		input.close();
	}
}
