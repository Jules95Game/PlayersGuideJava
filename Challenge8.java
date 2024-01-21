import java.util.Scanner;

public class Challenge8	 {
	public static void main(String[] args) {
		System.out.println("Calculate the area of a triangle.");
		System.out.println("Please note that the area will be rounded down to a whole number.");
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("What is the length of the base?");
		int triangleBase = inputScanner.nextInt();
		System.out.println("What is the length of the height?");
		int triangleHeight = inputScanner.nextInt();
		int triangleArea = triangleBase * triangleHeight / 2;
		System.out.println("Your triangle has an area of " + triangleArea + ".");
	}
}