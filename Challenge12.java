import java.util.Scanner;

public class Challenge12 {
	public static void main(String[] args) {
		System.out.println("Clocktower pendulum.");
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("How many seconds should it run: ");
		int seconds = inputScanner.nextInt();
		for (int i = 1; i <= seconds; i++) {
			if (i % 2 == 0) System.out.println("Tick");
			else System.out.println("Tock");
		}
	}
}