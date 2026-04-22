
public class HocSinhChuyen extends HocSinh {
	private String monChuyen ;
	private double diemMonChuyen;
	
	public double getDiemMonChuyen() {
		return diemMonChuyen;
	}

	public void setDiemMonChuyen(double diemMonChuyen) {
		this.diemMonChuyen = diemMonChuyen;
	}

	public String getMonChuyen() {
		return monChuyen;
	}

	public void setMonChuyen(String monChuyen) {
		this.monChuyen = monChuyen;
	}

	public HocSinhChuyen(String hoTen, int tuoi, String monChuyen,double diemMonChuyen) {
		super(hoTen, tuoi);
		this.monChuyen = monChuyen;
		this.diemMonChuyen = diemMonChuyen ;
	}
	public HocSinhChuyen() {
	}
	@Override 
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Mon chuyen: "+monChuyen);
		System.out.println("Diem mon chuyen: "+diemMonChuyen);
		System.out.println("---------------------");
	}
}
