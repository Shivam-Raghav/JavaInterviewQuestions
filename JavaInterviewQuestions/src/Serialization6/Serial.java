package Serialization6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
	public static void main(String[] args) throws IOException  {
		// create object of student
				Student student = new Student("Shivam Raghav", "shivamraghav5it@gmail.com", 20, "Noida");

				// write data to file
				FileOutputStream fos = new FileOutputStream("ob.txt");

				ObjectOutputStream oos = new ObjectOutputStream(fos);

				// how to serialize

				oos.writeObject(student);

				oos.close();
				fos.close();

				System.out.println("Object stated is transfered to file ob !! ");
		
	}
}
