
public class Run_NganHang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaiKhoan t1 = new TaiKhoan("0384775009","Duy",1000);
		t1.rutTien(999);
		t1.hienThiThongTin();
		TaiKhoangTietKiem tk1 = new TaiKhoangTietKiem("66130649","Duy",10000,6,0.2,5 	);
		tk1.hienThiThongTin();
		tk1.rutTien(999);
		TaiKhoanThanhToan t2 = new TaiKhoanThanhToan("0335108209","Anh",6000,5000,20);
		t2.hienThiThongTin();
		t2.rutTien(999);
	}

}
