import java.io.*;
import java.text.*;

public class operator {
	public static void main(String[] args) {
		int i = 1;
		int counter = 0;
		enum Size {SMALL, MEDIUM};
		Size s = Size.SMALL;
		System.out.println(s);
		String e = "  ";
		String greeting = "Hellolololo";
		System.out.println("greeting length == " + greeting.length());
		String g = greeting.substring(1, 3);
		System.out.println(g);
		String expletive = "Expletive";
		String PG13 = "deleted";
		String message = expletive + e + PG13;
		System.out.println(message);
		boolean f = greeting.equalsIgnoreCase("hell");
		if (PG13.length() == 0) {
			System.out.println(f);
		}
		else {
			System.out.println(!f);
		}
		int index = greeting.offsetByCodePoints(0, i);
		int cp = greeting.codePointAt(index);
		System.out.println(cp);
		int q = 0;
		if(greeting != null && greeting.length() != 0) {
			while(q < greeting.length() || counter <= greeting.length()) {
				q = greeting.indexOf("lo",counter);
				counter++;
				System.out.println(counter);
				if(counter == greeting.length()) {
					break;
				}
			}
		}
		String all = String.join("/ ","s","m","l","xl");
		System.out.println(all);
		StringBuilder builder = new StringBuilder();
		builder.append(PG13);
		builder.append(greeting);
		String completedString = builder.toString();
		System.out.println(completedString);
		
		}
}
