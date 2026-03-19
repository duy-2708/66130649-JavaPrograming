
public class NhanVienVanPhong extends NhanVien{
	private double soGioLamThem ;
	private double luongThemMoiGio;
	public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoTen, luongCoBan);
		this.soGioLamThem = soGioLamThem;
		this.luongThemMoiGio = luongThemMoiGio;
	}
	@Override
	public double tinhLuong() {
		return super.getLuongCoBan() +soGioLamThem*luongThemMoiGio;
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("So gio lam them "+soGioLamThem);
		System.out.println("Luong moi gio lam them "+ luongThemMoiGio);
		System.out.println("Luong nhan duoc "+tinhLuong());
	}
	
	
	
	
}
