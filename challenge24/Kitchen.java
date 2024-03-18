import java.util.Scanner;

public class Kitchen {
  private Scanner input = new Scanner(System.in);

  public void cook() {
    System.out.println("What do you want to make?");
    for (SoupType item : SoupType.values()) {
      System.out.println(item);
    }
    SoupType soupType = getSoupType();
    System.out.println();

    System.out.println("What is your main ingredient?");
    for (Ingredient item : Ingredient.values()) {
      System.out.println(item);
    }
    Ingredient ingredient = getIngredient();
    System.out.println();

    System.out.println("And your seasoning?");
    for (Seasoning item : Seasoning.values()) {
      System.out.println(item);
    }
    Seasoning seasoning = getSeasoning();
    System.out.println();

    Soup soup = new Soup(soupType, ingredient, seasoning);
    System.out.println(soup.getName());
  }

  private SoupType getSoupType() {
    while (true) {
      String userInput = input.nextLine().toUpperCase();
      for (SoupType item : SoupType.values()) {
        if (userInput.equals(item.toString())) {
          return item;
        }
      }
      System.out.print("Please enter a valid option. ");
    }
  }

  private Ingredient getIngredient() {
    while (true) {
      String userInput = input.nextLine().toUpperCase();
      for (Ingredient item : Ingredient.values()) {
        if (userInput.equals(item.toString())) {
          return item;
        }
      }
      System.out.print("Please enter a valid option. ");
    }
  }

  private Seasoning getSeasoning() {
    while (true) {
      String userInput = input.nextLine().toUpperCase();
      for (Seasoning item : Seasoning.values()) {
        if (userInput.equals(item.toString())) {
          return item;
        }
      }
      System.out.print("Please enter a valid option. ");
    }
  }
}
