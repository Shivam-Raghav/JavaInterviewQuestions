package input.output;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) throws IOException {
		try (FileReader sourceStream = new FileReader("file.txt");) {

			int temp;
			while ((temp = sourceStream.read()) != -1) {
				System.out.print((char) temp);
			}

		} catch (Exception e) {
			System.out.println("Exception : " + e);
			e.printStackTrace();
		}
	}

}
