
public class SanPham {
	private String maSP ;
	private String tenSP ;
	private double Gia ;
	private double soLuong;
	
	public SanPham() {
		maSP = "6666" ;
		tenSP = "Dau goi";
		Gia = 100 ;
		soLuong = 1 ;
	}
	public SanPham(String maSP , String tenSP , double Gia ,double soLuong ) {
		setmaSP(maSP);
		this.tenSP = tenSP ;
		setsoLuong(soLuong);
		setGia(Gia);
	}
	String getmaSP() {
		return maSP;
	}
	String gettenSP() {
		return tenSP ;
	}
	double getGia() {
		return Gia ;
	}
	double getsoLuong() {
		return soLuong;
	}
	public void setmaSP(String maSPM ) {
		if(maSPM != null && !maSPM.isEmpty()) {
			maSP = maSPM ;
		}else {
			System.out.println("MaSP khong duoc de trong ");
		}
	}
	void setGia(double GiaM) {
		if(GiaM > 0 ) {
			Gia = GiaM ;
		}else {
			System.out.println("Gia phai lon hon 0 ");
		}
	}
	void setsoLuong (double soLuongM) {
		if(soLuongM >= 0 ) {
			soLuong = soLuongM ;
		}else {
			System.out.println("So Luong phai lon hon bang 0 ");
		}
	}
	void settenSP(String tenSPM) {
		tenSP = tenSPM ;
	}
	public  double tinhThanhtien() {
	return this.Gia*this.soLuong ;
	}
	public String hienThithongtin () {
		String s = " Ma SP ";
				s = s+ maSP ;
		s = s+" TenSP " +tenSP ;
		s = s+" SoLuong "+soLuong+ "|| Thanh tien ";
		s = s + tinhThanhtien();
		
		return s ;
	}
	
	
	
}
