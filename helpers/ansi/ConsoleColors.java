package helpers.ansi;

public class ConsoleColors {
  private static final String ANSI_RESET = "\u001B[0m";

  private static final String ANSI_BLACK = "\u001B[30m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";
  private static final String ANSI_PURPLE = "\u001B[35m";
  private static final String ANSI_CYAN = "\u001B[36m";
  private static final String ANSI_WHITE = "\u001B[37m";

  private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
  private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
  private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
  private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
  private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
  private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
  private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
  private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";


  public static String whiteText(String input) {
    return ANSI_WHITE + input + ANSI_RESET;
  }

  public static String blackText(String input) {
    return ANSI_BLACK + input + ANSI_RESET;
  }

  public static String whiteBackground(String input) {
    return ANSI_WHITE_BACKGROUND + input + ANSI_RESET;
  }

  public static String blackBackground(String input) {
    return ANSI_BLACK_BACKGROUND + input + ANSI_RESET;
  }


  public static String blackOnWhite(String input) {
    return ANSI_WHITE_BACKGROUND + ANSI_BLACK + input + ANSI_RESET;
  }

  public static String whiteOnBlack(String input) {
    return ANSI_BLACK_BACKGROUND + ANSI_WHITE + input + ANSI_RESET;
  }


  public static String redText(String input) {
    return ANSI_RED + input + ANSI_RESET;
  }

  public static String greenText(String input) {
    return ANSI_GREEN + input + ANSI_RESET;
  }

  public static String yellowText(String input) {
    return ANSI_YELLOW + input + ANSI_RESET;
  }

  public static String blueText(String input) {
    return ANSI_BLUE + input + ANSI_RESET;
  }

  public static String purpleText(String input) {
    return ANSI_PURPLE + input + ANSI_RESET;
  }

  public static String cyanText(String input) {
    return ANSI_CYAN + input + ANSI_RESET;
  }


  public static String redBackground(String input) {
    return ANSI_RED_BACKGROUND + input + ANSI_RESET;
  }

  public static String greenBackground(String input) {
    return ANSI_GREEN_BACKGROUND + input + ANSI_RESET;
  }

  public static String yellowBackground(String input) {
    return ANSI_YELLOW_BACKGROUND + input + ANSI_RESET;
  }

  public static String blueBackground(String input) {
    return ANSI_BLUE_BACKGROUND + input + ANSI_RESET;
  }

  public static String purpleBackground(String input) {
    return ANSI_PURPLE_BACKGROUND + input + ANSI_RESET;
  }

  public static String cyanBackground(String input) {
    return ANSI_CYAN_BACKGROUND + input + ANSI_RESET;
  }
}
