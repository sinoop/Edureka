package module004.zzMytests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileRead {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/java.txt");
		/*
		 * System.out.println("No of bytes to be read = "+fin.available());
		 * System.out.println((char)fin.read()); System.out.println(fin.read());
		 * System.out.println("No of bytes to be read = "+fin.available());
		 */
		/*
		 * //read the complete contents of file byte-by-byte int n =fin.read(); while(n
		 * != -1) { System.out.print((char)n); n = fin.read(); Thread.sleep(50); }
		 */

		/*
		 * //read the complete contents of file byte[] b = new byte[fin.available()];
		 * fin.read(b); String data = new String(b); System.out.println(data);
		 */

		// read the data from file line-by-line
		InputStreamReader reader = new InputStreamReader(fin); // to convert byte stream to character stream
		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
			Thread.sleep(2000);
		}
		fin.close();
		br.close();
	}
}