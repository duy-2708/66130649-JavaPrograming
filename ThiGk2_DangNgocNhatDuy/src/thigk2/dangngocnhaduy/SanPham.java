package thigk2.dangngocnhaduy;

public class SanPham {
	private String maSP ;
	private String tenSP ;
	private String loaiSP ;
	private double giaSP ;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public double getGiaSP() {
		return giaSP;
	}
	public void setGiaSP(double giaSP) {
		this.giaSP = giaSP;
	}
	public void hienThiThongTin() {
		System.out.println("Ma SP: "+maSP);
		System.out.println("Ten SP: "+tenSP );
		System.out.println("Loai SP: "+loaiSP );
		System.out.println("Gia SP: "+giaSP);
		System.out.println("---------------------");
	}
}
