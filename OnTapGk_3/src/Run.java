import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<HocSinhChuyen> ds = new ArrayList();
		System.out.println("Nhap n danh sach ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i< n ; i++) {
			HocSinhChuyen hsi = new HocSinhChuyen();
			System.out.println("Nhap ho va ten: ");
			hsi.setHoTen(sc.nextLine());
			System.out.println("Nhap tuoi: ");
			hsi.setTuoi(sc.nextInt());
			sc.nextLine();
			System.out.println("Nhap mon chuyen ");
			hsi.setMonChuyen(sc.nextLine());
			System.out.println("Nhap diem: ");
			hsi.setDiemMonChuyen(sc.nextDouble());
			sc.nextLine();
			ds.add(hsi);
		}
		for(var x: ds) {
			x.hienThiThongTin();
		}
		for(var diem : ds ) {
			if(diem.getMonChuyen().equals("Toan") && diem.getDiemMonChuyen() > 8) {
				diem.hienThiThongTin();
			}		
		}
		System.out.println("Xoa 1 hoc sinh ");
		String ten = sc.nextLine();
		for(int i= 0 ; i <ds.size();i++) {
			if(ds.get(i).getHoTen().equalsIgnoreCase("ten")) {
				ds.remove(ds.get(i));
			}
		}
		System.out.println("Sap xep tang dan theo chieu cao ");
		for(int i = 0 ; i<ds.size()-1;i++) {
			for(int j = i+1 ; j<ds.size();j++) {
				if(ds.get(i).getDiemMonChuyen() > ds.get(j).getDiemMonChuyen()) {
					HocSinhChuyen tam = ds.get(i);
				ds.set(i, ds	.get(j));
					ds.set(j, tam);
					
				}
	}
		ds.sort((h1, h2) -> Double.compare(h1.getDiemMonChuyen(), h2.getDiemMonChuyen()));
		for(var x: ds) {
			x.hienThiThongTin();
		}
		
	}

	}
}
