package assignment;
import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num for fib seq");
		int e = input.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = 0;
		System.out.println(fib1 + " " + fib2);
		for(int i = 0; i <= e; i++) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.println(fib3);
		}
		input.close();
	}
}
