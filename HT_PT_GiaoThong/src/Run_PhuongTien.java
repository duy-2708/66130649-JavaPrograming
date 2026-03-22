
public class Run_PhuongTien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhuongTien pt1 = new PhuongTien("Yamaha",2006,100);
		System.out.print(pt1.toString());
		XeMay x1 = new XeMay("PKL",2006,100,150,"So");
		System.out.print("\n"+x1.toString());
		Oto o1 = new Oto("Misubasi ",2006,1000,8,"Dien");
		System.out.print("\n"+o1.toString());
		System.out.println("\nThue truoc ba "+o1.tinhThueTruocBa());
	}

}
