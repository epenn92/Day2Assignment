package assignment;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number19 {

	public static void main(String[] args) {
		
		String str = "This is an umbrella";
		ArrayList<String> str1 = new ArrayList<String>();
		
		StringTokenizer st1 = new StringTokenizer(str," ");
		while(st1.hasMoreTokens()) {
			str1.add(st1.nextToken());
		}
		System.out.println(str1);
		int highest = 0;
		int lowest = 0;
		for(String s : str1) {
			System.out.println(s.length());
			if(s.length() > highest) 
				highest = s.length();
			if(s.length() < lowest || lowest == 0)
				lowest = s.length();
		}
		System.out.println("longest word is: " + highest + "\nshortest word is "
				+ lowest);
	}
}
