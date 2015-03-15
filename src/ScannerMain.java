
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import uni.SimpleCharStream;
import uni.Token;
import uni.UniParserConstants;
import uni.UniParserTokenManager;

public class ScannerMain {

	public static void main(String[] args) {

		for (int i = 1; i <= 1; i++ ) {
			File f = new File("tests" + System.getProperty("file.separator") + "input" + i + ".txt");

			FileInputStream is;
			try {
				is = new FileInputStream(f);

				UniParserTokenManager scanner = new UniParserTokenManager(new SimpleCharStream(is));
				
				Token t;
				
				while ((t = scanner.getNextToken()).kind != UniParserConstants.EOF) {
					System.out.println(t.image);
				}
				
				System.out.println("input" + i + " Done");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}