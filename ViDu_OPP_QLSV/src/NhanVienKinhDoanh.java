
public class NhanVienKinhDoanh extends NhanVien {
	private double doanhSo ;
	private double tiLeHoaHong;
	public NhanVienKinhDoanh(String maNV, String hoTen, double luongCoBan, double doanhSo, double tiLeHoaHong) {
		super(maNV, hoTen, luongCoBan);
		this.doanhSo = doanhSo;
		this.tiLeHoaHong = tiLeHoaHong;
	}
	@Override
	public double tinhLuong() {
		return super.getLuongCoBan()+(doanhSo*tiLeHoaHong/100);
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Doanh So "+doanhSo);
		System.out.println("Ty le hoa hong "+tiLeHoaHong);
		System.out.println("Tong luong "+tinhLuong());
		System.out.println("Chuc vu: Nhan Vien Kinh Doanh");
	}
	public void chamSocKhachHang() {
		System.out.println(super.getHoTen()+"dang cham soc khach hang ");
	}
}	
