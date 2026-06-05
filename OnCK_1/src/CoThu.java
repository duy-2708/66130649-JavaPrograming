
public class CoThu {
	private String maCT ;
	private String hoTen ;
	private int namSinh;
	private String quocGia;
	private double diemTichLuy;
	public CoThu() {
		
	}
	public CoThu(String maCT, String hoTen, int namSinh , String quocGia , double diemTichLuy) {
		this.maCT = maCT ;
		this.hoTen = hoTen ;
		this.namSinh = namSinh ;
		this.diemTichLuy = diemTichLuy;
		this.quocGia = quocGia;
	}
	public String getMaCT() {
		return maCT;
	}
	public void setMaCT(String maCT) {
		this.maCT = maCT;
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
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	public double getDiemTichLuy() {
		return diemTichLuy;
	}
	public void setDiemTichLuy(double diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}
	public void hienThiThongTin() {
		System.out.println("MaCT: "+maCT);
		System.out.println("TenCT: "+hoTen);
		System.out.println("NamSinh: "+namSinh);
		System.out.println("QuocGia: "+quocGia);
		System.out.println("DiemTichLuy: "+diemTichLuy);
		System.out.println("===========================");
	}
}
