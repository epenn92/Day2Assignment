package assignment;
import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("number?");
		int e = input.nextInt();
		System.out.println("power of?");
		int e1 = input.nextInt();
		int num = 1;
		if(e1 == 0)
			num = 1;
		for(int i = 1; i <= e1; i++) {
			num *= e;
		}
		System.out.println(num);
		input.close();
	}
}
