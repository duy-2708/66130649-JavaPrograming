
public class Oxy {
	private double  x;
	private double y ;
	public Oxy (double x , double y) {
		this.x = x ;
		this.y = y ;
	}
	public double tinhKhoangcach(Oxy d ) {
		return Math.sqrt(Math.pow(this.x - d.x,2)+
				Math.pow(this.y+d.y,2));
	}
	public double kiemTratrungnhau(Oxy d) {
		if(this.x == d.x && this.y == d.y ){
			return 1;
		}else {
			return -1 ;
		}
	}
	public Oxy  doiXungquagoc() {
		return new Oxy(-this.x,-this.y);
	}
	double getX () {
		return x ;
	}
	double getY() {
		return y ;
	}
}
