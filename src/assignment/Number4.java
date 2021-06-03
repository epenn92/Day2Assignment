package assignment;
import java.util.Scanner;
public class Number4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("give a number");
		int e = input.nextInt();
		int reverse = 0;
//		500/10 50/10 5
//		350/10 35/10 3.5
		while(e != 0 ) {
			int num1 = e % 10;
			reverse = reverse * 10 + num1;
			e /= 10;
		}
		System.out.println("reverse num: " + reverse);
		input.close();
	}
}
