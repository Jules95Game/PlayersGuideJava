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
    } else {
      String enemyPosition = "";
      if (enemyY > 0) {
        enemyPosition += "north";
      }
      if (enemyY < 0) {
        enemyPosition += "south";
      }
      if (enemyX > 0) {
        enemyPosition += "east";
      }
      if (enemyX < 0) {
        enemyPosition += "west";
      }
      printEnemyPosition(enemyPosition);
    }
  }

  static void printEnemyPosition(String enemyPosition) {
    System.out.println("The enemy is to the " + enemyPosition + "!");
  }
}
