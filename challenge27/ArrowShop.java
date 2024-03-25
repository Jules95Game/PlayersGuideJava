import java.util.Scanner;

public class ArrowShop {
  private Scanner input = new Scanner(System.in);

  public void menu() {
    showMenu();
    Arrow chosenArrow = getChosenArrow(StringToInteger.parseInRange(1, 4));
    System.out.println();
    System.out.println("The arrow costs: " + chosenArrow.getCost());
  }

  private void showMenu() {
    System.out.println("What are you interested in?");
    System.out.println("1. Elite Arrow");
    System.out.println("2. Beginner Arrow");
    System.out.println("3. Marksman Arrow");
    System.out.println("4. Custom Arrow");
    System.out.print("Enter a number: ");
  }

  private Arrow getChosenArrow(int userChoice) {
    return switch (userChoice) {
      case 1 -> Arrow.createEliteArrow();
      case 2 -> Arrow.createBeginnerArrow();
      case 3 -> Arrow.createMarksmanArrow();
      case 4 -> createCustomArrow();
      default -> null;
    };
  }

  private Arrow createCustomArrow() {
    System.out.println();
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

    return new Arrow(arrowhead, fletching, arrowLength);
  }

  private String getUserInput() {
    return input.nextLine().toUpperCase().replace(' ', '_');
  }

  private ArrowHead getArrowHead() {
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

  private Fletching getFletching() {
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
