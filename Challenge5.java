import java.util.Scanner;

public class Challenge5 {
	public static void main(String[] args) {
		System.out.println("What kind of thing are we talking about?");
		Scanner input = new Scanner(System.in);
		//String a is the thing we want to name
		String a = input.next();
		System.out.println("How would you describe it? Big? Azure? Tattered?");
		//String b is a description of our thing
		String b = input.next();
		//String c is the hardcoded text "of Doom"
		String c = "of Doom";
		//String d is the hardcoded text "3000"
		String d = "3000";
		//There is an extra "of" in the output
		System.out.println("The " + b + " " + a + " " + c + " " + d + "!");
	}
}