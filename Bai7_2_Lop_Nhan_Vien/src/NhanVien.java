
public class NhanVien {
	 private String maNV ;
	 private String hoTen ;
	 private double luongCoban ;
	 private double heSoluong;
		public NhanVien ( String maNV , String hoTen , double luongCoban , double heSoluong ) {
			this.maNV = maNV ;
			this.hoTen = hoTen ;
			this.luongCoban = luongCoban ;
			this.heSoluong = heSoluong ;
		}
	String getmaNV() {
			return maNV ;
	}
		
	String gethoTen () {
		return hoTen ;
	}
	double getluongCoban() {
		return luongCoban ;
	}
	double heSoluong() {
		return heSoluong ;
	}
	void setmaNV(String maNVM) {
		maNV = maNVM ;
	}
	void settenHo(String hoTenM) {
		hoTen = hoTenM ;
	}
	void setluongCoban(double luongCobanM) {
		luongCoban = luongCobanM ;
	}
	void setheSoluong (double heSoluongM) {
		heSoluong = heSoluongM ;
	}
	public double tinhLuong() {
		return luongCoban * heSoluong ;
	}
	public String xepLoai() {
		String s ;
		if(tinhLuong() >= 20000000 ) {
			s =  maNV +" La Xuat sac " ;
		}else if(tinhLuong() >= 15000000) {
			s = maNV+" La Gioi " ;
		}else {
			s= maNV +" La Kha" ;
		}
		return s ;
	}
	
	
	
}	
