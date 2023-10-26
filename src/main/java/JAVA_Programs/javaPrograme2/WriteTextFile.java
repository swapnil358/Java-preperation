package JAVA_Programs.javaPrograme2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {

		String fileContent = "This is Java interview questions by Swapnil";

		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"C:\\Users\\swapn\\eclipse-workspace\\mySelenium\\Selenium\\src\\JavaPrograms_Part2\\samplefile.txt"));

		
		bw.write(fileContent);
		bw.close();
	
	
	}

}
