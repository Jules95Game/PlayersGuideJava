import java.util.Scanner;

public class Challenge4 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bread is ready.");
		System.out.println("Who is the bread for?");
		String userName = inputScanner.nextLine();
		System.out.println("Noted: " + userName + " got bread.");
	}
}