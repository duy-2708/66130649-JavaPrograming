
public class QuanLi extends NhanVien {
	private double phuCapChucVu ;
	private double heSoKinhNghiem;
	public QuanLi(String maNV, String hoTen, double luongCoBan, double phuCapChucVu, double heSoKinhNghiem) {
		super(maNV, hoTen, luongCoBan);
		this.phuCapChucVu = phuCapChucVu;
		this.heSoKinhNghiem = heSoKinhNghiem;
	}
	@Override
	public double tinhLuong() {
		return (super.getLuongCoBan())*(heSoKinhNghiem)+phuCapChucVu;
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Phu cap chuc vu "+phuCapChucVu);
		System.out.println("He so kinh nghiem "+ heSoKinhNghiem);
		System.out.println("Tong luong "+tinhLuong());
		
	}
	public void hopBanGiamDoc() {
		System.out.println(super.getHoTen()+"Dang hop voi giam doc ");
	}
}
