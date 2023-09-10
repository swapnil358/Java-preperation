package Programs.javaPrograme2;

import java.io.IOException;

public class OpenNotepad {

	public static void main(String[] args) {

		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("calc");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
