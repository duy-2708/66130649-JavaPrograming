import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList ;
import java.util.List;
import java.io.PrintWriter;

public class Run_CoThu {
	public static final String TEN_FILE ="CoThu.txt";
	static List<CoThu> ds = new ArrayList<CoThu>();
	public static void Doc_File() throws IOException {
		try( BufferedReader br = new BufferedReader(new FileReader(TEN_FILE))){
			String dong ;
			while((dong = br.readLine()) != null ){
				String []data =  dong.split(";");
				if(data.length >= 5) {
					String maCT = data[0].trim();
					String hoTen = data[1].trim();
					int namSinh = Integer.parseInt(data[2].trim());
					String quocGia = data[3].trim();
					double diemTichLuy = Double.parseDouble(data[4].trim());
					CoThu c1 = new CoThu(maCT,hoTen,namSinh,quocGia,diemTichLuy);
					ds.add(c1);
					
				}
			}
			System.out.println("===============Danh sach co thu==================");
			for(var x : ds) {
				x.hienThiThongTin();
			}
		}catch(NumberFormatException e) {
			System.out.println("Loi "+e.getMessage());
		}
	}
	public static void TimCoThu(List<CoThu>ds) {
		for(var x : ds) {
			if(x.getQuocGia().trim().equalsIgnoreCase("trung quoc")) {
				x.hienThiThongTin();
			}
		}
	}
	public  static  void xuatds(List<CoThu>ds) {
		for(var x : ds) {
			x.hienThiThongTin();
		}
	}
	public static void SapXep(List<CoThu>ds) {
		ds.sort((x1,x2) -> Double.compare(x2.getDiemTichLuy(), x1.getDiemTichLuy()));
	}
	public static void ghiThem(List<CoThu>ds) throws FileNotFoundException {
		try(PrintWriter wr = new PrintWriter( new FileWriter("CoThu.txt",true))){
			int dem = 0 ;
			for(var x : ds) {
				if(x.getDiemTichLuy() >= 90) {
					wr.println(x.getMaCT() +"--" +x.getHoTen()+"--"+x.getDiemTichLuy() );
					dem++;
				}
			}
			if(dem > 0) {
				System.out.println("So co thu "+dem+" :Da them thanh cong ");
			}else {
				System.out.println("Khong co ai du trinh ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		Doc_File();
		System.out.println("==============DanhSachTrungQuoc==============");
		TimCoThu(ds);
		System.out.println("==============DanhSachGiamDan==============");
		SapXep(ds);
		xuatds(ds);
		ghiThem(ds);
		
		
	}
}
