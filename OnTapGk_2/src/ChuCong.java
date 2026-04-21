
public class ChuCong extends VanDongVien {
	private int lucDap ;

	public int getLucDap() {
		return lucDap;
	}

	public void setLucDap(int lucDap) {
		this.lucDap = lucDap;
	}
	public ChuCong(String maVDV , String hoTen , double tall,int lucDap) {
		this.lucDap = lucDap ;
	}
	public ChuCong() {
		
	}
	@Override 
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Luc dap: "+lucDap);
	}
}
