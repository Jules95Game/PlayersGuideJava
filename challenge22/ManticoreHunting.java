package challenge22;

import helpers.ansi.ConsoleColors;
import helpers.parser.StringToInteger;

public class ManticoreHunting {
  private ConsoleColors color;
  private StringToInteger input;

  private int healthManticore = 10;
  private int healthCity = 15;
  private int distanceAirship = 0;
  private int turn = 1;

  public void run() {
    System.out.print("Player 1, how far away from the city do you want to station the Manticore? ");
    distanceAirship = input.parseInRange(0, 100);
    clearScreen();

    System.out.println("Player 2, it is your turn.");
    while (healthManticore > 0 && healthCity > 0) {
      printStatus();

      int cannonPower = getCannonPower();
      System.out.printf("The cannon is expected to deal %d damage this round.\n", cannonPower);
      System.out.print("Enter desired cannon range: ");

      if (fireCannon(input.parseInRange(0, 100))) {
        healthManticore -= cannonPower;
      }
      if (healthManticore > 0) {
        healthCity--;
      }

      determineWin();
      turn++;
    }
  }

  private void clearScreen() {
    for (int line = 0; line < 50; line++) {
      System.out.println();
    }
  }

  private void printStatus() {
    System.out.println("------------------------------------------------------------");
    System.out.printf(
        "STATUS: Round: %d City: %d/15 Manticore %d/10\n", turn, healthCity, healthManticore);
  }

  private int getCannonPower() {
    if (turn % 3 == 0 && turn % 5 == 0) {
      return 10;

    } else if (turn % 3 == 0 || turn % 5 == 0) {
      return 3;

    } else {
      return 1;
    }
  }

  private boolean fireCannon(int distancePlayer) {
    if (distancePlayer < distanceAirship) {
      System.out.println("That round FELL SHORT of the target.");
      return false;

    } else if (distancePlayer > distanceAirship) {
      System.out.println("That round OVERSHOT the target.");
      return false;

    } else {
      System.out.println("That round was a DIRECT HIT!");
      return true;
    }
  }

  private void determineWin() {
    if (healthManticore < 1) {
      System.out.println("The Manticore has been destroyed! The city of Consolas has been saved!");
    }
    if (healthCity < 1) {
      System.out.println("The Manticore devastates Consolas! The city of Consolas has Fallen!");
    }
  }
}
