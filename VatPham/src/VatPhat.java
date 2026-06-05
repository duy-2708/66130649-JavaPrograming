
public class VatPhat {
	private String maVP ;
	public String getMaVP() {
		return maVP;
	}
	public void setMaVP(String maVP) {
		this.maVP = maVP;
	}
	public String getTenVP() {
		return tenVP;
	}
	public void setTenVP(String tenVP) {
		this.tenVP = tenVP;
	}
	public String getLoaiVP() {
		return loaiVP;
	}
	public void setLoaiVP(String loaiVP) {
		this.loaiVP = loaiVP;
	}
	public int getDoHiem() {
		return doHiem;
	}
	public void setDoHiem(int doHiem) {
		this.doHiem = doHiem;
	}
	private String tenVP ;
	private String loaiVP ;
	private	int doHiem;
	public VatPhat(String maVP, String tenVP, String loaiVP, int doHiem) {
		this.maVP = maVP;
		this.tenVP = tenVP;
		this.loaiVP = loaiVP;
		this.doHiem = doHiem;
	}
	public void hienThiThongTin() {
		System.out.println("MaVP: "+maVP);
		System.out.println("TenVP: "+tenVP);
		System.out.println("LoaiVP: "+loaiVP);
		System.out.println("DoHiem: "+doHiem);
		System.out.println("=====================");
	}
}
