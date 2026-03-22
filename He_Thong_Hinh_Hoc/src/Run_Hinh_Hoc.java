
public class Run_Hinh_Hoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h1 = new HinhHoc("Hinh_Dai","Xanh");
		h1.hienThiThongTin();
		HinhChuNhat hcn1 =  new HinhChuNhat("Hinh_Chu_Nhat ","Do",3.0,4.0);
		hcn1.hienThiThongTin();
		HinhTron ht1 = new HinhTron("Hinh_Tron ","Vang ",5);
		ht1.hienThiThongTin();
		TamGiac tg1 = new TamGiac("Tam_Giac","Xanh reu ",3,4,7);
		tg1.hienThiThongTin();
	}

}
