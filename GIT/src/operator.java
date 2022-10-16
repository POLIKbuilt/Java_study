public class operator {
	public static void main(String[] args) {
		int i = 1;
		enum Size {SMALL, MEDIUM};
		Size s = Size.SMALL;
		System.out.println(s);
		String e = "  ";
		String greeting = "Hello";
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
	}
}
