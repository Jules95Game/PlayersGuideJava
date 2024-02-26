import helpers.parser.StringToInteger;

public class Challenge16 {
  private static StringToInteger userInput;

  public static void main(String[] args) {
    System.out.print("User 1, enter a number between 0 and 100: ");
    int airshipDistance = userInput.parseInRange(0, 100);
    clearScreen();

    System.out.println("User 2, guess the number.");
    while (true) {
      System.out.print("What is your next guess? ");
      int userGuess = userInput.parseInRange(0, 100);
      if (userGuess < airshipDistance) {
        System.out.println(userGuess + " is too low.");
      } else if (userGuess > airshipDistance) {
        System.out.println(userGuess + " is too high.");
      } else {
        System.out.println("You guessed the number!");
        return;
      }
    }
  }

  private static void clearScreen() {
    for (int i = 0; i < 50; i++) {
      System.out.println();
    }
  }
}
