
public class TaiKhoanThanhToan extends TaiKhoan {
	public double hanMucRut ;
	public double phiGiaoDich;
	public TaiKhoanThanhToan(String soTaiKhoan, String tenChuTaiKhoan, double soDu, double hanMucRut,
			double phiGiaoDich) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.hanMucRut = hanMucRut;
		this.phiGiaoDich = phiGiaoDich;
	}
	@Override
	public void rutTien(double soTienRut) {
		if(soTienRut <= soDu && soTienRut <= hanMucRut) {
			soDu-= (soTienRut+phiGiaoDich);
			super.rutTien(soTienRut);
		}else {
			System.out.println("Han muc rut chi duoc 5000");
			System.out.println("Hoac Vuot so tien dang co");
		}
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Han muc rut  "+hanMucRut);
		System.out.println("phi giao dich "+phiGiaoDich);
	}
	public void thanhToanHoaDon(double tienHoaDon) {
		if(tienHoaDon > soDu) {
			System.out.println("So tien khong du thanh toan");
		}else {
			soDu-=(tienHoaDon+phiGiaoDich);
			System.out.println("So tien sau khi thanh toan"+soDu);
		}
	}
}

