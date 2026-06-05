import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList ;
import java.util.List;
import java.io.PrintWriter;
public class Run_Vat_Pham {
	public static final String TEN_FILE ="hom_thinh.txt";
	public static List<VatPhat>ds = new ArrayList();
	public static void doc_file() {
		try(BufferedReader br = new BufferedReader( new FileReader(TEN_FILE))){
			String dong ;
			while((dong = br.readLine()) != null) {
				String [] data = dong.split(";");
				if(dong.length() >= 4) {
					String maVP = data[0].trim();
					String tenVP = data[1].trim();
					String loaiVP = data[2].trim();
					int doHiem = Integer.parseInt(data[3].trim());
					VatPhat v = new  VatPhat(maVP, tenVP , loaiVP,doHiem);
					ds.add(v);
					
				}
			}
			System.out.println("=============DanhSach===========");
			for(var x : ds) {
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
	public static void locVuKhi(List<VatPhat>ds) {
		for(var x : ds) {
			if(x.getLoaiVP().trim().equalsIgnoreCase("Vu khi")) {
				x.hienThiThongTin();
			}
		}
	}
	public static void nhapKho(VatPhat vp) {
		try( PrintWriter wr = new PrintWriter( new FileWriter("hom_thinh.txt",true))){
			wr.println(vp.getMaVP()+"-"+ vp.getLoaiVP()+"-"+vp.getDoHiem()+"-");
			System.out.println("=========Da cat thanh cong==========");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doc_file();
		System.out.println("==============VuKhi============");
		locVuKhi(ds);
		VatPhat duyne = new VatPhat("27","Duy","Trai",100);
		nhapKho(duyne);
	}

}
