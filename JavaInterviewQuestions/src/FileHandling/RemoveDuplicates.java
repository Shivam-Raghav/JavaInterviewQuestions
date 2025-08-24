package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		try (PrintWriter pw = new PrintWriter("Output.txt");
				BufferedReader br = new BufferedReader(new FileReader("file.txt"));) {
			String line = br.readLine();

			// Set store unique values
			HashSet<String> hs = new HashSet<>();
			while (line != null) {
				if (hs.add(line)) {
					pw.println(line);
				}
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File operation performed successfully");
	}

}
