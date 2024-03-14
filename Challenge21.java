public class Challenge21 {
  public static void main(String[] args) {
    countdown(10);
  }

  private static void countdown(int number) {
    if (number < 1) return;
    System.out.println(number);
    countdown(--number);
  }
}
