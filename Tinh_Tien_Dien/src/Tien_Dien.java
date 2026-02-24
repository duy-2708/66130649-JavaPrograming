import java.util.Scanner;
import java.util.InputMismatchException;

public class Tien_Dien {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		double tienDien = 0 ;
		
		try {
			System.out.printf("Nhap so dien tieu thu trong thang ");
			double So_Dien = sc.nextDouble();
	            if (So_Dien <= 50) {
	                tienDien = So_Dien * 1678;
	            } else if (So_Dien <= 100) {
	                tienDien = 50 * 1678 + (So_Dien - 50) * 1734;
	            } else if (So_Dien <= 200) {
	                tienDien = 50 * 1678 + 50 * 1734 + (So_Dien - 100) * 2014;
	            } else if (So_Dien <= 300) {
	                tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (So_Dien - 200) * 2536;
	            } else if (So_Dien <= 400) {
	                tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (So_Dien - 300) * 2834;
	            } else {
	                tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (So_Dien - 400) * 2927;
	            }
	            System.out.printf("Tong tien dien ban phai tra la: %,.0f VNĐ\n", tienDien);
		} catch(InputMismatchException e) {
			System.out.printf("Ban vua nhap sai dinh dang , chi nhap so ");
		} finally {
			if (sc != null ) {
				sc.close();
			}
			System.out.printf("Chuong trinh da ket thuc ");
		}
	}
}
