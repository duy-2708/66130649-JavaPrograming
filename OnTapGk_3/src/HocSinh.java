
public class HocSinh {
	private String hoTen ;
	private int tuoi ;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public HocSinh(String hoTen, int tuoi) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
	}
	public HocSinh() {
		
	}
	public void hienThiThongTin() {
		System.out.println("Ho va Ten: "+hoTen);
		System.out.println("Tuoi: "+tuoi);
	}
	
	
}
