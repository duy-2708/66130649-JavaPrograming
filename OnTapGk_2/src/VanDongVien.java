
public class VanDongVien {
	private String maVDV ;
	private String hoTen ;
	private double tall ;
	public VanDongVien(String maVDV , String hoTen , double tall) {
		this.maVDV = maVDV ;
		this.hoTen = hoTen ;
		this.tall = tall  ;
	}
	public VanDongVien() {
		
	}
	public String getMaVDV() {
		return maVDV;
	}
	public void setMaVDV(String maVDV) {
		this.maVDV = maVDV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public void hienThiThongTin() {
		System.out.println("Ma VDV: "+maVDV);
		System.out.println("Ho va ten: "+hoTen);
		System.out.println("Chieu cao: "+tall);
	}
}
