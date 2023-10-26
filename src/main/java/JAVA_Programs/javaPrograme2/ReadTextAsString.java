package JAVA_Programs.javaPrograme2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextAsString {

	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
	}

	public static void main(String[] args) throws Exception {
		String data = readFileAsString(
				"D:\\JavaInterviewPreperation\\src\\main\\java\\Programs\\javaPrograme2\\samplefile.txt");
		System.out.println(data);
	}
}
