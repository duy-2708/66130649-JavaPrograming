
public class Oto extends PhuongTien{
	public double soCho ;
	public String kieuDongCo;

	public Oto(String hanSanXuat, int namSanXuat, int giaBan, double soCho, String kieuDongCo) {
		super(hanSanXuat, namSanXuat, giaBan);
		this.soCho = soCho;
		this.kieuDongCo = kieuDongCo;
	}

	@Override
	public double layVanTocToiDa() {
		return 180;
	}
	@Override 
	public double laySoChoNgoi() {
		return soCho;
	}

	@Override
	public String toString() {
		return "Oto ["+super.toString()+"soCho=" + soCho + ", kieuDongCo=" + kieuDongCo + "]";
	}
	public double tinhThueTruocBa() {
		return super.giaBan*0.1;
	}
	
}
