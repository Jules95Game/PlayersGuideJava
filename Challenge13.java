import java.util.Scanner;

public class Challenge13 {
	public static void main(String[] args) {
		System.out.println("Enemy direction.");
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("The enemy's x position: ");
		int enemyX = inputScanner.nextInt();
		System.out.print("The enemy's y position: ");
		int enemyY = inputScanner.nextInt();
		
		if (enemyX == 0 && enemyY == 0) {
			System.out.println("The enemy is here!");
		}
		else if (enemyX == 0 && enemyY > 0) {
			PrintEnemyPosition("north");
		}
		else if (enemyX == 0 && enemyY < 0) {
			PrintEnemyPosition("south");
		}
		else if (enemyX > 0 && enemyY == 0) {
			PrintEnemyPosition("east");
		}
		else if (enemyX < 0 && enemyY == 0) {
			PrintEnemyPosition("west");
		}
		else if (enemyX > 0 && enemyY > 0) {
			PrintEnemyPosition("northeast");
		}
		else if (enemyX > 0 && enemyY < 0) {
			PrintEnemyPosition("southeast");
		}
		else if (enemyX < 0 && enemyY > 0) {
			PrintEnemyPosition("northwest");
		}
		else if (enemyX < 0 && enemyY < 0) {
			PrintEnemyPosition("southwest");
		}
		else {
			System.out.println("The enemy's position is unknown.");
		}
	}
	
	
	static void PrintEnemyPosition(String enemyPosition) {
		System.out.println("The enemy is to the " + enemyPosition + "!");
	}
}