package thigk2.DangNgocNhatDuy;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Doc_File_80 {
	private static final String TEN_FILE = "file80.txt";
	public static void NgaySinh(int dong) {
		if(dong == 27 ) {
			System.out.println("Ngay sinh "+dong);
		}
	}
	public static void main(String[] args) {
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
}

