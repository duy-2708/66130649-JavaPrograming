package dnnduy;

public class HocSinh {
	private String tenHS ;
	private short tuoiHS ;
	private int lopHS ;
	public HocSinh (String tenHS , short tuoiHS ,int lopHS) {
		this.tenHS = tenHS ;
		this.tuoiHS = tuoiHS ;
		this.lopHS = lopHS ;
	}
	public HocSinh() {
		
	}
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public short getTuoiHS() {
		return tuoiHS;
	}
	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public int getLopHS() {
		return lopHS;
	}
	public void setLopHS(int lopHS) {
		this.lopHS = lopHS;
	}
	public void hienthithongtin() {
		System.out.println("Ten hoc sinh : "+tenHS);
		System.out.println("Tuoi hoc sinh: "+tuoiHS);
		System.out.println("Lop hoc sinh: "+lopHS);
	}
}
