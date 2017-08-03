package Day5;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random randomNumGenerator = new Random();
		for (int idx = 1; idx <= 10; ++idx) {
			int randomInt = randomNumGenerator.nextInt(100);
			System.out.println("Random Number= " + randomInt);

		}
	}
}
