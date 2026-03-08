import java.util.Scanner;
public class Run_Nhan_Vien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap maNV ");
		String manv = sc.nextLine();
		System.out.println("Nhap ho ten nhan vien ");
		String tenho = sc.nextLine();
		System.out.println("Nhap so luong cua nhan vien ");
		double soluong = sc.nextDouble();
		System.out.println("Nhap he luong co ban cua nhan vien ");
		double heso = sc.nextDouble();
		NhanVien nv1 = new NhanVien(manv , tenho , soluong , heso);
		System.out.println("Xep loai cua nhan vien co maso do la ");
		System.out.println(nv1.xepLoai());
		
	}

}
