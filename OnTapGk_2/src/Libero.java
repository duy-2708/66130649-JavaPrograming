
public class Libero extends VanDongVien{
	private int doDeoDai ;

	public int getDoDeoDai() {
		return doDeoDai;
	}

	public void setDoDeoDai(int doDeoDai) {
		if(  doDeoDai > 1 && doDeoDai <= 10  ) {
			this.doDeoDai = doDeoDai;
		}else {
			System.out.println("Mac dinh do deo dai = 1 ");
			this.doDeoDai = 1;
		}
	}
	public Libero(String maVDV , String hoTen , double tall,int doDeoDai) {
		this.doDeoDai= doDeoDai ;
	}
	public Libero() {
		
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Do deo dai: "+doDeoDai);
	}
}
