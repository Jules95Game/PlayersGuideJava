import java.util.Scanner;

public class Challenge10 {
  public static void main(String[] args) {
    System.out.println("Kingdom value calculator.");
    Scanner inputScanner = new Scanner(System.in);

    System.out.print("How many estates do you own: ");
    int estates = inputScanner.nextInt();

    System.out.print("How many duchies do you own: ");
    int duchies = inputScanner.nextInt();

    System.out.print("How many provinces do you own: ");
    int provinces = inputScanner.nextInt();

    int kingdomScore = estates + duchies * 3 + provinces * 6;
    System.out.print("Your kingdom score is: " + kingdomScore);
  }
}
