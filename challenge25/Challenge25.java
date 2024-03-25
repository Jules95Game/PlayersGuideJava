import java.util.Scanner;

public class Challenge25 {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Choose your arrowhead type:");
    for (ArrowHead value : ArrowHead.values()) {
      System.out.println(value);
    }
    ArrowHead arrowhead = getArrowHead();
    System.out.println();

    System.out.println("Choose your fletching type:");
    for (Fletching value : Fletching.values()) {
      System.out.println(value);
    }
    Fletching fletching = getFletching();
    System.out.println();

    System.out.println("Choose a length between 60 and 100 cm:");
    double arrowLength = StringToDouble.parseInRange(60, 100);

    Arrow arrow = new Arrow(arrowhead, fletching, arrowLength);
    System.out.println("The arrow costs: " + arrow.getCost());
  }

  private static String getUserInput() {
    return input.nextLine().toUpperCase().replace(' ', '_');
  }

  private static ArrowHead getArrowHead() {
    while (true) {
      String userInput = getUserInput();
      for (ArrowHead value : ArrowHead.values()) {
        if (userInput.equals(value.toString())) {
          return value;
        }
      }
      System.out.print("Please enter a valid option. ");
    }
  }

  private static Fletching getFletching() {
    while (true) {
      String userInput = getUserInput();
      for (Fletching value : Fletching.values()) {
        if (userInput.equals(value.toString())) {
          return value;
        }
      }
      System.out.print("Please enter a valid option. ");
    }
  }
}
