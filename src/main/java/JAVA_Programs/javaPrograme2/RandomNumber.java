package JAVA_Programs.javaPrograme2;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			generateRandomNumber();
		}
	}

	private static void generateRandomNumber() {
		Random rand = new Random();
		int r1 = rand.nextInt(1000);
		System.out.println("Random numbers: " + r1);
	}
}
