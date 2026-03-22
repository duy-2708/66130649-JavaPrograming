
public class HinhTron extends HinhHoc {
	public double banKinh ;

	public HinhTron(String ten, String mauSac, double banKinh) {
		super(ten, mauSac);
		this.banKinh = banKinh;
	}
	@Override 
	public double tinhDienTich() {
		return banKinh*banKinh*Math.PI;
	}
	@Override
	public double tinhChuVi() {
		return 2*banKinh*Math.PI;
	}
	@Override 
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Ban kinh r: "+banKinh);
		System.out.println("Dien tich S :"+tinhDienTich() );
		System.out.println("Chu vi : "+tinhChuVi());
	}
}
