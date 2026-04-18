import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList ;
public class Run_Doc_File {
	private static final String TEN_FILE = "vanban.txt";
	static ArrayList<SinhVien > dssinhvien = new ArrayList<SinhVien>();
	public static void main(String[] args) {
		doc_file();
	}
	private static void doc_file() {
		try (BufferedReader reader = new BufferedReader(new FileReader(TEN_FILE))){
		String dong ;
		while ((dong = reader.readLine())!= null) {
			String [] data = dong.split(";");
			
			if(data.length >= 4) {
				int stt = Integer.parseInt(data[0].trim());
				String hoTen = data[1].trim();
				int namSinh = Integer.parseInt(data[2].trim());
				String gioiTinh = data[3].trim();
				SinhVien sv = new SinhVien(stt,hoTen,namSinh,gioiTinh);
				dssinhvien.add(sv);
			}
			System.out.println("Danh Sanh Sinh Vien");
			for(var sv : dssinhvien) {
				sv.hienThiThongTin();
				System.out.println("-----------------");
			}
		}
	}catch (IOException e) {
		System.out.println("Loi" +e.getMessage());
	}
}

}
