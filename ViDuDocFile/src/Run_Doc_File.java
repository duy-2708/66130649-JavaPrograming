import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList ;
public class Run_Doc_File {
	private static final String TEN_FILE = "vanban.txt";
	static ArrayList<SinhVien > dssinhvien = new ArrayList<SinhVien>();
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
	public static int soluong() {
		int dem = 0 ;
		for(var sv: dssinhvien) {
			if(sv != null) {
				dem++ ;
			}
		}
		return dem ;
	}
	public static void sv2006() {
		for( var sv : dssinhvien) {
			if(sv.getNamSinh() == 2006) {
				sv.hienThiThongTin();
			}
		}
	}
	public static void nu() {
		for(var sv: dssinhvien) {
			if(sv.getGioiTinh().trim().equals("Nu")) {
				sv.hienThiThongTin();
			}
		}
	}
	public static void SapXep() {
		for(int i = 0 ; i< dssinhvien.size()-1;i++) {
			for(int j = i+1 ; j < dssinhvien.size();j++) {
				if(dssinhvien.get(i).getHoTen().compareTo(dssinhvien.get(j).getHoTen()) < 0) {
					SinhVien tam = dssinhvien.get(i);
					dssinhvien.set(i,dssinhvien.get(j));
					dssinhvien.set(j, tam);
					
				}
			}
		}
	}
	public static void Xuatds() {
		for(var sv : dssinhvien) {
			sv.hienThiThongTin();
		}
	}
	public static void main(String[] args) {
		doc_file();
		System.out.println("So luong sinh vien "+soluong());
		System.out.println("Nhung sinh vien 2006");
		sv2006();
		System.out.println("----------------");
		nu();
		System.out.println("----------------");
		System.out.println("Day sau khi sap xep tang dan la :");
		SapXep();
		Xuatds();
	}

}
