package helper.parser;

import java.util.Scanner;

public class StringToDouble {
  private static Scanner inputScanner = new Scanner(System.in);

  public static double parseDouble(String userInput) {
    do {
      Double parsed = tryParse(userInput);
      if (parsed != null) {
        return parsed;
      } else {
        System.out.println("\nCould not parse input.");
        System.out.print("Please enter a decimal value: ");
        userInput = inputScanner.nextLine();
      }
    } while (true);
  }

  public static double doubleInRange(String userInput, double minValue, double maxValue) {
    do {
      double parsed = parseDouble(userInput);
      if (parsed >= minValue && parsed <= maxValue) {
        return parsed;
      } else {
        System.out.println("\nInput is not between " + minValue + " and " + maxValue + ".");
        System.out.print("Please enter a number within range: ");
        userInput = inputScanner.nextLine();
      }
    } while (true);
  }

  private static Double tryParse(String input) {
    try {
      return Double.parseDouble(input);
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
