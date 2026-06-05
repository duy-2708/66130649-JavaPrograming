import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList ;
import java.util.List;
import java.io.PrintWriter;
public class Run_LinhKien {
	public static final String TEN_FILE="linhkien.txt";
	public static List<LinhKien>ds = new ArrayList<LinhKien>();
	public static List<LinhKien>ds2 = new ArrayList<LinhKien>();
	public static void doc_file() {
		try(BufferedReader br = new BufferedReader( new FileReader(TEN_FILE))){
			String dong;
			while((dong = br.readLine()) != null) {
				String [] data = dong.split(";");
				if(dong.length() >=4) {
					String ma = data[0].trim();
					String ten = data[1].trim();
					String hang = data[2].trim();
					double gia = Double.parseDouble(data[3].trim());
					LinhKien lk = new LinhKien(ma,ten,hang,gia);
					ds.add(lk);
				}
			}
			System.out.println("============DanhSachLinhKien=============");
			for( var x : ds) {
				x.hienThiThongTin();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void locDanhSach(List<LinhKien>ds) {
		for( var x: ds) {
			if(x.getHangSX().trim().equalsIgnoreCase("logitech")) {
				ds2.add(x);
				ds2.sort((x1,x2) -> Double.compare(x2.getGiaBan(),x1.getGiaBan()));
			}
		}
	}
	public static void Xuat(List<LinhKien>ds) {
		for(var x: ds) {
			x.hienThiThongTin();
		}
	}
	public static void themLinhKien(List<LinhKien>ds) {
		try(PrintWriter wr = new PrintWriter(new FileWriter("linhkien.txt",true))){
			for(var x :ds) {
				wr.println(x.getMaLK()+" || "+ x.getTenLK()+" || "+ x.getGiaBan());
			}
			System.out.println("=======ThemThanhCong=======");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doc_file();
		locDanhSach(ds);
		System.out.println("==============DanhSachGiaLogiTech==========");
		Xuat(ds2);
		System.out.println("==============ThemDanhSachLinhKien==========");
		themLinhKien(ds);
		
	}

}
