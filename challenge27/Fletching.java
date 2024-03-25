public enum Fletching {
  PLASTIC(10),
  TURKEY_FEATHERS(5),
  GOOSE_FEATHERS(3);

  public final float price;

  private Fletching(float price) {
    this.price = price;
  }
}
