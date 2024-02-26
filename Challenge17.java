import helpers.ansi.ConsoleColors;

public class Challenge17 {
  private static ConsoleColors color;

  public static void main(String[] args) {
    for (int crankTurn = 1; crankTurn < 101; crankTurn++) {
      if (crankTurn % 3 == 0 && crankTurn % 5 == 0) {
        System.out.println(color.blueText("Electric Fire!"));
      } else if (crankTurn % 3 == 0) {
        System.out.println(color.redText("Fire"));
      } else if (crankTurn % 5 == 0) {
        System.out.println(color.yellowText("Electric"));
      } else {
        System.out.println("Normal");
      }
    }
  }
}
