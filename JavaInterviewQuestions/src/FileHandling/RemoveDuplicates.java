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
			System.out.println("File in not present on your path please check there ..... Thanks");
			System.exit(0); // terminates JVM
		}
		System.out.println("File operation performed successfully");
	}

}
