import java.util.Scanner;
import java.util.ArrayList;
public class QuanLyNhom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ThanhVien> ds = new ArrayList<ThanhVien>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n danh sach ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i<n ; i++) {
			ThanhVien tvi = new ThanhVien();
			System.out.println("Nhap MaSV: ");
			tvi.setMaSV(sc.nextLine());
			System.out.println("Nhap ho va ten: ");
			tvi.setHoTen( sc.nextLine());
			System.out.println("Nhap nhiem vu: ");
			tvi.setNhiemVu(sc.nextLine());
			ds.add(tvi);
		}
		for( var x : ds ) {
			System.out.println("MaSV: "+x.getMaSV());
			System.out.println("Ho va ten: "+ x.getHoTen());
			System.out.println("Nhiem vu: "+x.getnhiemVu());
		}
		System.out.println("1.Neu muon them thanh vien ");
		System.out.println("2.Khong them thanh vien ");
		int chon = sc.nextInt();
		sc.nextLine();
		if(chon == 1) {
			ThanhVien tvt = new ThanhVien();
			System.out.println("Nhap MaSV: ");
			tvt.setMaSV(sc.nextLine());
			System.out.println("Nhap ho va ten: ");
			tvt.setHoTen( sc.nextLine());
			System.out.println("Nhap nhiem vu: ");
			tvt.setNhiemVu(sc.nextLine());
			ds.add(2,tvt);
		}
		for(var t : ds ) {
			if(t.getHoTen() .equals("Hao") ) {
				String nv = "Support code Java ";
				t.setNhiemVu(nv);
			}
		}
		for(var s : ds ) {
			if(s.getnhiemVu().equals(" ")) {
				ds.remove(s);
			}
		}
		for( var x : ds ) {
			System.out.println("MaSV: "+x.getMaSV());
			System.out.println("Ho va ten: "+ x.getHoTen());
			System.out.println("Nhiem vu: "+x.getnhiemVu());
			System.out.println("----------------------------");
		}
	}

}
