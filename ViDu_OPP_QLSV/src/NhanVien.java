
public class NhanVien {
	private String maNV ;
	private String hoTen ;
	private double luongCoBan ;
	public NhanVien() {
		
	}
	
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}

	public double tinhLuong() {
		return luongCoBan ;
	}
	public void hienThiThongTin() {
		System.out.println("Ma nhan vien: "+maNV);
		System.out.println("Ho va ten nhan vien: "+hoTen);
		System.out.println("Luong co ban cua nhan vien: "+luongCoBan);
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	
	
}
