import java.util.ArrayList;

public class Challenge9 {
	public static void main(String[] args) {
		System.out.println("When will the Duckbear get more eggs then the sisters?");
		ArrayList<Integer> totalsWhereDuckWins = new ArrayList<Integer>();
		for (int totalEggs = 0; totalEggs < 101; totalEggs++) {
			int sisterEggs = totalEggs / 4;
			int duckEggs = totalEggs % 4;
			if (duckEggs > sisterEggs) {
				totalsWhereDuckWins.add(totalEggs);
			}
		}
		System.out.println("When the egg count is one of these:");
		for (int eggs : totalsWhereDuckWins) {
			System.out.println(eggs);
		}
	}
}