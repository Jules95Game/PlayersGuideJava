import java.util.Scanner;

public class Kitchen {
  private Scanner input = new Scanner(System.in);

  public void cook() {
    System.out.println("What do you want to make?");
    System.out.println("Soup,");
    System.out.println("Stew or");
    System.out.println("Gumbo");
    SoupType soupType = getSoupType();
    System.out.println();

    System.out.println("What is your main ingredient?");
    System.out.println("Mushroom,");
    System.out.println("Chicken,");
    System.out.println("Carrot or");
    System.out.println("Potato");
    Ingredient ingredient = getIngredient();
    System.out.println();

    System.out.println("And your seasoning?");
    System.out.println("Spicy,");
    System.out.println("Salty or");
    System.out.println("Sweet");
    Seasoning seasoning = getSeasoning();
    System.out.println();

    Soup soup = new Soup(soupType, ingredient, seasoning);
    System.out.println(soup.getName());
  }

  private SoupType getSoupType() {
    while (true) {
      String userInput = input.nextLine();
      switch (userInput.toUpperCase()) {
        case "SOUP":
          return SoupType.SOUP;
        case "STEW":
          return SoupType.STEW;
        case "GUMBO":
          return SoupType.GUMBO;
        default:
          System.out.print("Please enter a valid option. ");
      }
    }
  }

  private Ingredient getIngredient() {
    while (true) {
      String userInput = input.nextLine();
      switch (userInput.toUpperCase()) {
        case "MUSHROOM":
          return Ingredient.MUSHROOM;
        case "CHICKEN":
          return Ingredient.CHICKEN;
        case "CARROT":
          return Ingredient.CARROT;
        case "POTATO":
          return Ingredient.POTATO;
        default:
          System.out.print("Please enter a valid option. ");
      }
    }
  }

  private Seasoning getSeasoning() {
    while (true) {
      String userInput = input.nextLine();
      switch (userInput.toUpperCase()) {
        case "SPICY":
          return Seasoning.SPICY;
        case "SALTY":
          return Seasoning.SALTY;
        case "SWEET":
          return Seasoning.SWEET;
        default:
          System.out.print("Please enter a valid option. ");
      }
    }
  }
}
