package thigk2.DangNgocNhatDuy;

public class ToaDo {
	private double toaX1 ;
	private double toaY1 ;
	private double toaX2 ;
	private double toaY2 ;
	public double getToaX1() {
		return toaX1;
	}
	public void setToaX1(double toaX1) {
		this.toaX1 = toaX1;
	}
	public double getToaY1() {
		return toaY1;
	}
	public void setToaY1(double toaY1) {
		this.toaY1 = toaY1;
	}
	public double getToaX2() {
		return toaX2;
	}
	public void setToaX2(double toaX2) {
		this.toaX2 = toaX2;
	}
	public double getToaY2() {
		return toaY2;
	}
	public void setToaY2(double toaY2) {
		this.toaY2 = toaY2;
	}
	public double DienTich() {
		return (toaX1 +toaX2 ) *(toaY1+toaY2);
	}
	public double ChuVi() {
		return ((toaX1 +toaX2 ) +(toaY1+toaY2));
	}
	public void hienThiThongTin() {
		System.out.println("Dien Tich "+DienTich());
		System.out.println("Chu Vi: "+ChuVi());
	}
}
