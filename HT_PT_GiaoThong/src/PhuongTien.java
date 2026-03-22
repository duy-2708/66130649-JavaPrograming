
public class PhuongTien {
	public String hanSanXuat;
	public int namSanXuat;
	public int giaBan ;
	public PhuongTien(String hanSanXuat, int namSanXuat, int giaBan) {
		super();
		this.hanSanXuat = hanSanXuat;
		this.namSanXuat = namSanXuat;
		this.giaBan = giaBan;
	}
	public double layVanTocToiDa() {
		return 0 ;
	}
	public double laySoChoNgoi() {
		return 0;
	}
	@Override
	public String toString() {
		return "PhuongTien [hanSanXuat=" + hanSanXuat + ", namSanXuat=" + namSanXuat + ", giaBan=" + giaBan + "]";
	}
	
}
