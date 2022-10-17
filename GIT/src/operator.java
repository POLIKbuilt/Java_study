import java.io.*;
import java.text.*;
import java.util.*;
import java.lang.System;
import java.nio.file.Paths;
import java.io.IOException;

public class operator {
	static char[] readPassword(String prompt, Object... args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		return name.toCharArray();
	}
	static String readLine(String prompt, Object... args) {
		Scanner instring = new Scanner(System.in);
		String fullname = instring.nextLine();
		return fullname;
	}
	public static void main(String[] args) throws IOException {
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
		System.out.printf("%,.2f", 10000.0 / 3.0);
		System.out.println();
		System.out.printf("%tc", new Date());
		System.out.println();
		System.out.printf("%1$s %2$tB %2$te, %2$tY \n", "Due date:", new Date());
		File newObj = new File("resources\\myfile.txt");
		if (newObj.createNewFile()) {
		 
			System.out.println("File created: " + newObj.getName());
		}
		else {
			System.out.println("File already exists.");
		}
		
		FileWriter newWriter = new FileWriter("resources\\myfile.txt");
		newWriter.write("files are so fucking stupid in Java.");
		newWriter.close();
		System.out.println("Successfully edited files.");
		
		
	}
}

