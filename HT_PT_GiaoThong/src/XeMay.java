
public class XeMay extends PhuongTien{
	public double dungTichXiLanh;
	public String loaiXe ;
	public XeMay(String hanSanXuat, int namSanXuat, int giaBan, double dungTichXiLanh, String loaiXe) {
		super(hanSanXuat, namSanXuat, giaBan);
		this.dungTichXiLanh = dungTichXiLanh;
		this.loaiXe = loaiXe;
	}
	@Override
	public double layVanTocToiDa() {
		return dungTichXiLanh ;
	}
	@Override
	public double laySoChoNgoi() {
		return 2 ;
	}
	@Override
	public String toString() {
		
;		return  "XeMay "+super.toString()+"[dungTichXiLanh=" + dungTichXiLanh + ", loaiXe=" + loaiXe + "]";
	}
	
}
