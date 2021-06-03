package assignment;
import java.util.Scanner;

public class Number11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("find a char");
		String e = input.next();
		char c = e.charAt(0);
		System.out.println("type a sentence");
		input.nextLine();
		String e1 = input.nextLine();
//		String e1 = Character.toString(c);
		if(e1.contains(Character.toString(c)))
			System.out.println("contains your char");
		else
			System.out.println("does not contain your char");
		input.close();
	}
}
