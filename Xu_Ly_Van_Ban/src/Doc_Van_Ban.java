import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Doc_Van_Ban {
	private static final String TEN_FILE = "vanban.txt";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		doc_file();
	}
	private static void doc_file() {
		try (BufferedReader reader = new BufferedReader(new FileReader(TEN_FILE))){
		String dong ;
		while ((dong = reader.readLine())!= null) {
			System.out.println(dong);
		}
	}catch (IOException e) {
		System.out.println("Loi" +e.getMessage());
	}
}
	private static void demcau(String dong) {
		int count  = 0 ;
		for(int i = 0 ; i< dong.length(); i++) {
			char c = dong.charAt(i);
			if( c == '.' || c == '!' || c == ';' || c=='?') {
				count++;
			}
		}
		
	}
}