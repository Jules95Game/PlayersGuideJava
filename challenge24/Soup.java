public class Soup {
  private SoupType soupType;
  private Ingredient ingredient;
  private Seasoning seasoning;

  public Soup(SoupType soupType, Ingredient ingredient, Seasoning seasoning) {
    this.soupType = soupType;
    this.ingredient = ingredient;
    this.seasoning = seasoning;
  }

  public String getName() {
    return seasoning + " " + ingredient + " " + soupType;
  }
}
