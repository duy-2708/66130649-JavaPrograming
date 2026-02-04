import java.util.Scanner;
import java.text.DecimalFormat;
public class DOIDO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double USD = 25000 ;
		final double URo = 30000 ;
	Scanner scanner = new Scanner(System.in);
	DecimalFormat format = new DecimalFormat("###,###,### VND ");
	System.out.println("Chọn 1 đổi từ USD sang Việt Nam ");
	System.out.println("Chọn 2 đổi từ URO sang Việt Nam ");
	int chon = scanner.nextInt();
	if(chon == 1) {
		System.out.println("Nhap số tiền USD ");
		double usd = scanner.nextDouble();
		double ketqua = usd * USD ;
		System.out.printf("Thành tiền %,.0f VND ",ketqua);
	}else if(chon == 2 ) {
		System.out.println("Nhập số tiền URO");
		double uro = scanner.nextDouble();
		double ketqua = uro * URo ;
		System.out.printf("Thành tiền %,.0f VND ",ketqua);
	}else {
		System.out.println("Lựa chọn không hợp lệ chỉ nhập 1 hoặc 2  ");
	}
	}

}
