
public class ThanhVien {
	private String maSV ; 
	private String hoTen ;
	private String nhiemVu ;
	public ThanhVien(String maSV , String hoTen , String nhiemVu ) {
		this.maSV = maSV ;
		this.hoTen = hoTen ;
		this.nhiemVu = nhiemVu ;
	}
	public ThanhVien() {
		
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMaSV() {
		return maSV ;
	}
	public void setMaSV(String maSV ) {
		this.maSV = maSV ;
	}
	public String getnhiemVu() {
		return nhiemVu ;
	}
	public void setNhiemVu(String nhiemVu) {
		this.nhiemVu = nhiemVu ;
	}
	public void hienThiThongTin() {
		System.out.println("Ma SV: "+maSV );
		System.out.println("Ho va ten: "+hoTen );
		System.out.println("Nhiem vu: "+nhiemVu);
	}
}
