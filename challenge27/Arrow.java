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
    return arrowHead.price + fletching.price + (float) (length * 0.05);
  }

  public static Arrow createEliteArrow() {
    return new Arrow(ArrowHead.STEEL, Fletching.PLASTIC, 95);
  }

  public static Arrow createBeginnerArrow() {
    return new Arrow(ArrowHead.WOOD, Fletching.GOOSE_FEATHERS, 75);
  }

  public static Arrow createMarksmanArrow() {
    return new Arrow(ArrowHead.STEEL, Fletching.GOOSE_FEATHERS, 65);
  }
}
