	
	public class TamGiac  extends HinhHoc{
		public double canhA ;
		public double canhB ;
		public double canhC ;
		public TamGiac(String ten, String mauSac, double canhA, double canhB, double canhC) {
			super(ten, mauSac);
			this.canhA = canhA;
			this.canhB = canhB;
			this.canhC = canhC;
		}
		public boolean Check() {
			if((canhA + canhB > canhC )&& (canhA + canhC > canhB)&&(canhB +canhC > canhA )) {
				return true ;
			}else return false;
		}
		@Override
		public void hienThiThongTin() {
			super.hienThiThongTin();
			if(Check()) {
				System.out.println("La hinh tam giac ");
			}else {
				System.out.println("Khong phai tam giac ");
			}
		}
	}
