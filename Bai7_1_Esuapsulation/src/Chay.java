import java.util.Scanner;
public class Chay {

	public static void main(String[] args) {
		SanPham sp = new SanPham();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma san pham");
		String masp = sc.nextLine();
		sp.setmaSP(masp);
		System.out.println("Nhap ten san pham");
		String tensp = sc.nextLine();
		sp.settenSP(tensp);
		System.out.println("Nhap Gia San Pham ");
		double gia = sc.nextDouble();
		sp.setGia(gia);
		System.out.println("Nhap so luong san pham ");
		double soluong = sc.nextDouble();
		sp.setsoLuong(soluong);
		System.out.println(sp.hienThithongtin());
		SanPham spMacDinh = new SanPham();
		System.out.println(spMacDinh.hienThithongtin());

	}

}
