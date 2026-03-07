
public class ChuNhat {
	private double dai ;
	private double rong;
	//--- Ham tao Constructor 
	public ChuNhat () {
		dai = 10 ;
		rong = 5 ;
		
	}
	
	public ChuNhat(double dai , double rong ) {
		this.dai = dai ;
		this.rong = rong ;
	}
//	public ChuNhat (double daiM , double rongM) {
//		dai = daiM ;
//		rong = rongM ;	
//	}
	//----Cac Getter 
	double getDai() {
		return dai ;
	}
	double getRong() {
		return rong;
	}
	//------Cac setter 
	void setDai(double daiM) {
		dai = daiM ;
	}
	void setRong(double rongM) {
		rong = rongM ;	
	}
	public String toString() {
		String s = " Hinh nay co chieu dai la: " ;
		s = s+ dai ;
		s = s +" va chieu rong la : " +rong ;
		return s ;	
	}
}

