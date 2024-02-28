import helpers.parser.StringToInteger;

public class Challenge18 {
  public static void main(String[] args) {
    int[] firstArray = new int[5];
    System.out.println("Please enter five numbers to fill the array.");
    System.out.print("First number: ");
    firstArray[0] = StringToInteger.parse();
    System.out.print("Second number: ");
    firstArray[1] = StringToInteger.parse();
    System.out.print("Third number: ");
    firstArray[2] = StringToInteger.parse();
    System.out.print("Fourth number: ");
    firstArray[3] = StringToInteger.parse();
    System.out.print("Fifth number: ");
    firstArray[4] = StringToInteger.parse();
    System.out.println();

    int[] secondArray = new int[5];
    for (int index = 0; index < 5; index++) {
      secondArray[index] = firstArray[index];
    }

    for (int index = 0; index < 5; index++) {
      System.out.println("1st array at index " + index + " = " + firstArray[index]);
      System.out.println("2nd array at index " + index + " = " + secondArray[index]);
      System.out.println();
    }
  }
}
