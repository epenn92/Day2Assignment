package assignment;
import java.util.Scanner;

public class Number1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give a number for multiplication");
		double e = input.nextDouble();
		double num = 0;
		for(int i = 0; i <= 10; i++) {
			num = e * i;
			System.out.println(num);
		}
		
		input.close();
	}
}
