import helpers.parser.StringToInteger;
import java.util.Scanner;

public class Challenge15 {
  public static void main(String[] args) {
    double ropeCost = 10;
    double torchesCost = 15;
    double climbingCost = 25;
    double waterCost = 1;
    double macheteCost = 20;
    double canoeCost = 200;
    double foodCost = 1;
    System.out.println("1. Rope");
    System.out.println("2. Torches");
    System.out.println("3. Climbing Equipment");
    System.out.println("4. Clean Water");
    System.out.println("5. Machete");
    System.out.println("6. Canoe");
    System.out.println("7. Food Supplies");
    System.out.print("What is your name: ");

    Scanner inputScanner = new Scanner(System.in);
    String userName = inputScanner.nextLine();
    System.out.println();
    if (userName.equalsIgnoreCase("Julian")) {
      System.out.println("Hello Julian. You get a 50% discount!");
      ropeCost /= 2;
      torchesCost /= 2;
      climbingCost /= 2;
      waterCost /= 2;
      macheteCost /= 2;
      canoeCost /= 2;
      foodCost /= 2;
    }

    System.out.print("What number do you want to see the price of? ");
    int userChoice = StringToInteger.parseInRange(1, 7);
    System.out.println();

    switch (userChoice) {
      case 1:
        System.out.println("Rope costs " + ropeCost + " gold.");
        break;
      case 2:
        System.out.println("Torches costs " + torchesCost + " gold.");
        break;
      case 3:
        System.out.println("Climbing Equipment costs " + climbingCost + " gold.");
        break;
      case 4:
        System.out.println("Clean Water costs " + waterCost + " gold.");
        break;
      case 5:
        System.out.println("Machete costs " + macheteCost + " gold.");
        break;
      case 6:
        System.out.println("Canoe costs " + canoeCost + " gold.");
        break;
      case 7:
        System.out.println("Food Supplies costs " + foodCost + " gold.");
        break;
      default:
        System.out.println("Invalid input.");
    }
  }
}
