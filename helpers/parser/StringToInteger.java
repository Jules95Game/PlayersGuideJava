package helpers.parser;

import java.util.Scanner;

public class StringToInteger {
  private static Scanner inputScanner = new Scanner(System.in);

  public static int parse() {
    while (true) {
      if (inputScanner.hasNextInt()) {
        int parsed = inputScanner.nextInt();
        inputScanner.nextLine();
        return parsed;
      } else {
        System.out.println("\nCould not parse input.");
        inputScanner.nextLine();
        System.out.print("Please enter an integer value: ");
      }
    }
  }


  public static int parseInRange(int minValue, int maxValue) {
    while (true) {
      int parsed = parse();

      if (parsed >= minValue && parsed <= maxValue) {
        return parsed;
      } else {
        System.out.println("\nInput is not between " + minValue + " and " + maxValue + ".");
        System.out.print("Please enter a number within range: ");
      }
    }
  }


  public static int parseNatural() {
    while (true) {
      int parsed = parse();

      if (parsed > 0) {
        return parsed;
      } else {
        System.out.println("\nInput is negative or zero.");
        System.out.print("Please enter a natural number: ");
      }
    }
  }
}
