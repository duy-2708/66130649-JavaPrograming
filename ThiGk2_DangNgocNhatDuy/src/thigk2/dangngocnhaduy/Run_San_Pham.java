package thigk2.dangngocnhaduy;
import java.util.Scanner;
import java.util.ArrayList;
public class Run_San_Pham {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SanPham> ds = new ArrayList();
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
	}

}
