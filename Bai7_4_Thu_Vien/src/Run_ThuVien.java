import java.util.Scanner ;
public class Run_ThuVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap ma sach ");
		String masach = sc.nextLine();
		System.out.println("Nhap ten sach ");
		String tensach = sc.nextLine();
		System.out.println("Nhap ten tac gia ");
		String tacgia = sc.nextLine();
		System.out.println("Nhap nam san xuat ");
		int nam = sc.nextInt();
		ThuVien tv = new ThuVien(masach,tensach,tacgia,nam);
		tv.muonSach();
		System.out.println("Neu muon tra sach nhap so 1 ");
		int trasach = sc.nextInt();
		tv.traSach();
		tv.kiemtraSachcu();
	}

}
