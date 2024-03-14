import java.util.Scanner;

public class Challenge23 {
  private static Scanner input = new Scanner(System.in);

  private enum Chest {
    OPEN,
    CLOSED,
    LOCKED
  }

  public static void main(String[] args) {
    Chest userChest = Chest.LOCKED;
    while (true) {
      System.out.print("The chest is " + userChest + ". What do you want to do? ");
      String userInput = input.nextLine();
      switch (userInput.toLowerCase()) {
        case "unlock":
          if (userChest == Chest.LOCKED) {
            userChest = Chest.CLOSED;
          }
          break;
        case "lock":
          if (userChest == Chest.CLOSED) {
            userChest = Chest.LOCKED;
          }
          break;
        case "open":
          if (userChest == Chest.CLOSED) {
            userChest = Chest.OPEN;
          }
          break;
        case "close":
          if (userChest == Chest.OPEN) {
            userChest = Chest.CLOSED;
          }
          break;
      }
    }
  }
}
