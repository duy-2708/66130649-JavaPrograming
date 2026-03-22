
public class TaiKhoangTietKiem extends TaiKhoan{
	public int kyHan ;
	public double laiSuat ;
	public int thangDaGui ;
	public TaiKhoangTietKiem(String soTaiKhoan, String tenChuTaiKhoan, double soDu, int kyHan, double laiSuat,int thangDaGui) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
		this.thangDaGui = thangDaGui ;
	}
	public double tinhLaiSuat() {
		return soDu*laiSuat*(kyHan/12.0) ;
	}
	@Override
	public void rutTien(double soTienRut) {
		if(thangDaGui < kyHan) {
			double tam = kyHan - thangDaGui ;
			System.out.println("Chua du ki han con: "+tam+"thang" );
		}else {
			super.rutTien(soTienRut);
		}
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("So ky han: "+kyHan);
		System.out.println("Lai suat: "+laiSuat);
		System.out.println("Tien lai suat "+tinhLaiSuat());
	}
}
