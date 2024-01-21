import java.util.Scanner;

public class Challenge9 {
	public static void main(String[] args) {
		System.out.println("Sisters/Duckbear egg divider.");
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("How many eggs are there to distribute?");
		int totalEggs = inputScanner.nextInt();
		int sisterEggs = totalEggs / 4;
		int duckEggs = totalEggs % 4;
		System.out.println("Each sister will get " + sisterEggs + " egg(s).");
		System.out.println("The Duckbear will get " + duckEggs + " egg(s).");
	}
}