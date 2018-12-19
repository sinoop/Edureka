package module004.zzMytests;

import java.io.*;

public class TestFile {
	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		int cnt = 0;
		
		try {
			in = new FileInputStream("J:\\Programming\\Eclipse\\Edureka\\src\\module004\\zzMytests\\testFile.txt");
			while ((in.read()) != -1) {
				++cnt;
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		System.out.println(cnt);
	}
}