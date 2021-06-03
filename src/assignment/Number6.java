package assignment;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Number6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter nums for array, seperate nums with spaces");
		String str = input.nextLine();
		ArrayList<String> num = new ArrayList<String>();
		
		int sum = 0;
		// 55 10 29 18 27
		StringTokenizer st1 = new StringTokenizer(str," ");
		while(st1.hasMoreTokens()) {
			num.add(st1.nextToken());
		}
		System.out.println(num);
		for( int i = 0; i < num.size(); i++) {
			sum += Integer.valueOf(num.get(i));
//			System.out.println(sum);
		}
		int average = sum/num.size();
		System.out.println("average of array is: " + average);
		input.close();
	}
}

//StringTokenizer st1 = new StringTokenizer("Hello, friend how, are, you?", ",");
//while(st1.hasMoreTokens()) {
//	System.out.println(st1.nextToken());
//}