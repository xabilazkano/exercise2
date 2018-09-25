import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		
		int number;
		Scanner num = new Scanner(System.in);
		int result = 0;
		
		System.out.println("The program will sum all the numbers you enter until the result is higher than 100");
		
		while (result<100) {
			System.out.println("Enter a number:");
			number = num.nextInt();
			result=result+number;
			System.out.println("The sum is: " + result);
		}
		System.out.println("The program has finished");
	}

}
