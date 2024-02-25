package helpers.parser;

import java.util.Scanner;

public class StringToDouble {
  private static Scanner inputScanner = new Scanner(System.in);

  public static double parse() {
    while (true) {
      if (inputScanner.hasNextDouble()) {
        double parsed = inputScanner.nextDouble();
        inputScanner.nextLine();
        return parsed;
      } else {
        System.out.println("\nCould not parse input.");
        inputScanner.nextLine();
        System.out.print("Please enter a decimal value: ");
      }
    }
  }


  public static double parseInRange(double minValue, double maxValue) {
    while (true) {
      double parsed = parse();

      if (parsed >= minValue && parsed <= maxValue) {
        return parsed;
      } else {
        System.out.println("\nInput is not between " + minValue + " and " + maxValue + ".");
        System.out.print("Please enter a number within range: ");
      }
    }
  }
}
