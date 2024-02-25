import helpers.ansi.ConsoleColors;

import java.awt.Toolkit;
import java.util.Scanner;

public class Challenge11 {
  private static ConsoleColors color;

  public static void main(String[] args) {
    System.out.println("Magical barrier location.");
    Scanner inputScanner = new Scanner(System.in);

    System.out.print("Target Row? ");
    int targetRow = inputScanner.nextInt();
    System.out.print("Target Column? ");
    int targetColumn = inputScanner.nextInt();

    System.out.println(color.redText("(" + (targetRow + 1) + ", " + targetColumn + ")"));
    System.out.println(color.yellowText("(" + (targetRow - 1) + ", " + targetColumn + ")"));
    System.out.println(color.greenText("(" + targetRow + ", " + (targetColumn + 1) + ")"));
    System.out.println(color.blueText("(" + targetRow + ", " + (targetColumn - 1) + ")"));

    Toolkit.getDefaultToolkit().beep();
  }
}
