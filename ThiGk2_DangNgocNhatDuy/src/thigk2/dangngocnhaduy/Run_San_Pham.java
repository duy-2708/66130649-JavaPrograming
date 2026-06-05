package thigk2.dangngocnhaduy;
import java.util.Scanner;
import java.util.ArrayList;
public class Run_San_Pham {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SanPham> ds = new ArrayList<>();
		ArrayList<SanPham> ds2 = new ArrayList<>();
		int n = 3 ;
		for( int i = 0 ; i< n ; i++) {
			SanPham spi = new SanPham();
			System.out.println("Nhap maSP: ");
			spi.setMaSP(sc.nextLine());
			System.out.println("Nhap tenSP: ");
			spi.setTenSP(sc.nextLine());
			System.out.println("Nhap loaiSP: ");
			spi.setLoaiSP(sc.nextLine());
			System.out.println("Nhap giaSP: ");
			spi.setGiaSP(sc.nextDouble());
			sc.nextLine();
			ds.add(spi);
		}
		for(SanPham sp: ds ) {
			sp.hienThiThongTin();
		}
		SanPham spt = new SanPham();
		System.out.println("Them moi 1 san pham: ");
		System.out.println("Nhap maSP: ");
		spt.setMaSP(sc.nextLine());
		System.out.println("Nhap tenSP: ");
		spt.setTenSP(sc.nextLine());
		System.out.println("Nhap loaiSP: ");
		spt.setLoaiSP(sc.nextLine());
		System.out.println("Nhap giaSP: ");
		spt.setGiaSP(sc.nextDouble());
		sc.nextLine();
		ds.add(spt);
		for(SanPham sp: ds ) {
			sp.hienThiThongTin();
		}
		System.out.println("Danh sach san pham loai Thuc Pham Chuc Nang: ");
		for(int i = 0 ; i< ds.size(); i++) {
			if(ds.get(i).getLoaiSP().equals("Thuc Pham Chuc Nang ")) {
				ds2.add(ds.get(i));
			}
		}
		for(SanPham sp2 :ds2 ) {
			sp2.hienThiThongTin();
		}
	}

}
