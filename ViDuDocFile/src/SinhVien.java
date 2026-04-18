
public class SinhVien {
	private int sTT ;
	private String hoTen ;
	private int namSinh ;
	private String gioiTinh;
	
	public SinhVien(int sTT, String hoTen, int namSinh, String gioiTinh) {
		super();
		this.sTT = sTT;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}
	public int getsTT() {
		return sTT;
	}
	public void setsTT(int sTT) {
		this.sTT = sTT;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public void hienThiThongTin() {
		System.out.println("STT: " +sTT);
		System.out.println("Ho va Ten: " +hoTen );
		System.out.println("Nam sinh: "+namSinh);
		System.out.println("Gioi Tinh: "+gioiTinh);
	}
}
