package dnnduy;
import java.util.Scanner ;
import java.util.ArrayList ;
public class Run_Hoc_Sinh {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		HocSinh hs1 = new HocSinh("Dang Ngoc Nhat Duy ",(short)12,12);
//		hs1.hienthithongtin(); 	
//		HocSinh hs2 = new HocSinh();
//		hs2.setTenHS("Nguyen Tien Dat ");
//		hs2.setTuoiHS((short)18);
//		hs2.setLopHS(12);
//		hs2.hienthithongtin();
//		HocSinh hs3 = new HocSinh();
//		System.out.println("Nhap ten hoc sinh thu 3");
//		hs3.setTenHS(sc.nextLine());
//		System.out.println("Nhap tuoi hoc sinh ");
//		hs3.setTuoiHS(sc.nextShort());
//		System.out.println("Nhap lop hoc sinh ");
//		hs3.setLopHS(sc.nextInt());
//		hs3.hienthithongtin();
		
		ArrayList <HocSinh> ds = new ArrayList();
		System.out.println("Nhap n hoc sinh ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i <n ; i++) {
			HocSinh hsi = new HocSinh();
			System.out.println("Nhap ten hoc sinh thu "+i);
			String ten = sc.nextLine();
			hsi.setTenHS(ten);
			System.out.println("Nhap tuoi hoc sinh"+i);
			short tuoi = sc.nextShort();
			hsi.setTuoiHS(tuoi);
			System.out.println("Nhap lop hoc sinh thu "+i);
			hsi.setLopHS(sc.nextInt());
			sc.nextLine();
			ds.add(hsi);
		}
		for(var hs : ds) {
			hs.hienthithongtin();
		}
		HocSinh hsthem = new HocSinh("Hoa",(short)12,12);
		ds.add(hsthem);
		for(var hs : ds) {
			hs.hienthithongtin();
		}
//		System.out.println("Nhap ten hoc sinh muon tim ");
//		String tentim = sc.nextLine();
		
		for(int i = 0 ; i< ds.size(); i++) {
			HocSinh hstim = ds.get(i);
			if(hstim.getTenHS() .equals("Hoa")){
				ds.remove(i);
				break;
			}
		}
		for(var hs : ds) {
			hs.hienthithongtin();
		}
	}

}
