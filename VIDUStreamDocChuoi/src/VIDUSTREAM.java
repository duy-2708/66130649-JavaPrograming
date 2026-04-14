import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader ;
import java.io.FileWriter ;	
import java.io.IOException ;
public class VIDUSTREAM {

	public static void main(String[] args) {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Nhap 1 chuoi bat ki ");
		 try {
			 String doc = br.readLine();
			 System.out.print(doc);
		 }catch(IOException e) {
			 System.out.println("Loi" +e.getMessage());
		 }
		 
	}

}
