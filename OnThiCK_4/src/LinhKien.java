
public class LinhKien {
	private String maLK ;
	private String tenLK ;
	private String hangSX;
	private double giaBan;
	public LinhKien(String maLK, String tenLK, String hangSX, double giaBan) {
		this.maLK = maLK;
		this.tenLK = tenLK;
		this.hangSX = hangSX;
		this.giaBan = giaBan;
	}
	public LinhKien() {
	}
	public String getMaLK() {
		return maLK;
	}
	public void setMaLK(String maLK) {
		this.maLK = maLK;
	}
	public String getTenLK() {
		return tenLK;
	}
	public void setTenLK(String tenLK) {
		this.tenLK = tenLK;
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public void hienThiThongTin() {
		System.out.println("MaLK: "+maLK);
		System.out.println("TenLK: "+tenLK);
		System.out.println("HangSX: "+hangSX);
		System.out.println("GiaBan: "+giaBan);
		System.out.println("========================");
	}
	
	
}
