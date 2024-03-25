public class Arrow {
  private ArrowHead arrowHead;
  private Fletching fletching;
  private double length;

  public Arrow(ArrowHead arrowHead, Fletching fletching, double length) {
    this.arrowHead = arrowHead;
    this.fletching = fletching;
    this.length = length;
  }

  public float getCost() {
    float fletchingPrice =
        switch (fletching) {
          case PLASTIC -> 10;
          case TURKEY_FEATHERS -> 5;
          case GOOSE_FEATHERS -> 3;
        };

    float lengthPrice = (float) (length * 0.05);

    return arrowHead.price + fletchingPrice + lengthPrice;
    // This body could be replaced by "return arrowHead.price + fletching.price + (float) (length *
    // 0.05);
  }
}
