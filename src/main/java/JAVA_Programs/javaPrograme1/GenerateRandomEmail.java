package JAVA_Programs.javaPrograme1;

import java.util.Random;

public class GenerateRandomEmail {

	public static void main(String[] args) {

		int n = 0;
		while(n <=10) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		System.out.println("Dummy_username" + randomInt + "@gmail.com");
		n++;
		}
	
	//String randomNumbers = RandomStringUtils.randomNumeric(5);
	//String phNo = "079393"+randomNumbers;
			
			
	}
}
