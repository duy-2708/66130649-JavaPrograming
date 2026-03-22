
public class HinhChuNhat extends HinhHoc{
	public double chieuDai ;
	public double chieuRong ;
	public HinhChuNhat(String ten, String mauSac, double chieuDai, double chieuRong) {
		super(ten, mauSac);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	@Override 
	public double tinhDienTich() {
		return chieuDai*chieuRong;
	}
	@Override
	public double tinhChuVi() {
		return 2*(chieuDai+chieuRong);
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Chieu dai: "+chieuDai);
		System.out.println("Chieu rong: "+chieuRong);
		System.out.println("Dien tich "+tinhDienTich()+"ChuVi: "+tinhChuVi());
	}
}
