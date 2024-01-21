import java.util.Scanner;
import java.awt.Toolkit;

public class Challenge11 {
	public static void main(String[] args) {
		System.out.println("Magical barrier location.");
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Target Row? ");
		int targetRow = inputScanner.nextInt();
		System.out.print("Target Column? ");
		int targetColumn = inputScanner.nextInt();
		
		System.out.println("(" + (targetRow + 1) + ", " + targetColumn + ")");
		System.out.println("(" + (targetRow - 1) + ", " + targetColumn + ")");
		System.out.println("(" + targetRow + ", " + (targetColumn + 1) + ")");
		System.out.println("(" + targetRow + ", " + (targetColumn - 1) + ")");
		
		Toolkit.getDefaultToolkit().beep();
	}
}