package Day2;

public class AsciitoChar {
	public static void main(String[] args) {
		printCharacters();
	}

	static void printCharacters() {
		int i = 1;
		do {
			System.out.print((char) i + "\t");
			if (i % 10 == 0)
				System.out.println("");
			i++;
		} while (i <= 122);
	}
}

