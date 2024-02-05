package helper.parser;

import java.util.Scanner;

public class StringToInteger {
  private static Scanner inputScanner = new Scanner(System.in);

  public static int parseInt(String userInput) {
    do {
      Integer parsed = tryParse(userInput);
      if (parsed != null) {
        return parsed;
      } else {
        System.out.println("\nCould not parse input.");
        System.out.print("Please enter an integer value: ");
        userInput = inputScanner.nextLine();
      }
    } while (true);
  }

  public static int integerInRange(String userInput, int minValue, int maxValue) {
    do {
      int parsed = parseInt(userInput);
      if (parsed >= minValue && parsed <= maxValue) {
        return parsed;
      } else {
        System.out.println("\nInput is not between " + minValue + " and " + maxValue + ".");
        System.out.print("Please enter a number within range: ");
        userInput = inputScanner.nextLine();
      }
    } while (true);
  }

  private static Integer tryParse(String input) {
    try {
      return Integer.parseInt(input);
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
