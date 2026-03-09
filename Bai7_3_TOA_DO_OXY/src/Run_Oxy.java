
public class Run_Oxy {
	public static void main(String[] args) {
		Oxy t1 = new Oxy(3,4);
		Oxy t2 = new Oxy(0,0);
		double khoangCach = t1.tinhKhoangcach(t2);
		System.out.println("Khoang cach cua 2 toa do la "+khoangCach);
		double trungNhau = t1.kiemTratrungnhau(t2);
		if(trungNhau == 1 ) {
			System.out.println("2 toa do trung nhau ");
		}else {
			System.out.println("2 toa do khong trung nhau ");
		}
		Oxy doiXung = t1.doiXungquagoc();
		System.out.println("Doi xung goc cua  X va Y "+doiXung.getX()+","+ doiXung.getY());
	}
}
