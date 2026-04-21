import java.util.Scanner ;
import java.util.ArrayList;
public class Run_VanDongVien {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chon = 0 ;
		ArrayList<VanDongVien>ds = new ArrayList<VanDongVien>();
		System.out.println("Nhap danh sach ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i =0 ; i< n ; i++) {
			do {
				System.out.println("1.Chu Cong");
				System.out.println("2.Libero");
				chon = sc.nextInt();
				sc.nextLine();
			}while(chon !=1 && chon != 2);
		
		if(chon == 1) {
			ChuCong cci = new ChuCong();
			System.out.println("Nhap ma VDV: ");
			cci.setMaVDV(sc.nextLine());
			System.out.println("Nhap ho va ten: ");
			cci.setHoTen(sc.nextLine());
			System.out.println("Nhap chieu cao ");
			cci.setTall(sc.nextDouble());
			System.out.println("Nhap luc dap: ");
			cci.setLucDap(sc.nextInt());
			sc.nextLine();
			ds.add(cci);
		}else if(chon == 2) {
			Libero cci = new Libero();
			System.out.println("Nhap ma VDV: ");
			cci.setMaVDV(sc.nextLine());
			System.out.println("Nhap ho va ten: ");
			cci.setHoTen(sc.nextLine());
			System.out.println("Nhap chieu cao ");
			cci.setTall(sc.nextDouble());
			System.out.println("Nhap do deo dai: ");
			cci.setDoDeoDai(sc.nextInt());
			sc.nextLine();
			ds.add(cci);
		}
	}
		for(var x : ds ) {
			x.hienThiThongTin();
		}
		System.out.println("Chieu cao > 1.75 va Luc dap > 8");
		for( var t : ds) {
			if(t instanceof ChuCong cci) {
				if(cci.getLucDap() > 8 &&(cci.getTall()>1.75)) {
					t.hienThiThongTin();
				}
			}
		}
	}

}
