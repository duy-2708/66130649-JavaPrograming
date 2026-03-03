import java.util.Scanner;
import java.util.ArrayList;
public class Quan_Li {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien ");
		 int n = sc.nextInt();
		 String [] tenSinhVien = new String[n];
		double [] diemSinhVien = new double[n];
		nhap(sc,tenSinhVien,diemSinhVien,n);
		xuat(tenSinhVien,diemSinhVien,n);
		
	}
	private static void nhap(Scanner sc,String[] tenSinhVien ,double diemSinhVien [] ,int n) {
		System.out.println("Nhap so luong hoc sinh ten va diem ");
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Nhap so sinh vien thu "+(i+1)+"---");
			sc.nextLine();
			System.out.println("Nhap ten ");
			tenSinhVien [i] = sc.nextLine();
			System.out.println("Nhap diem ");
			diemSinhVien [i] = sc.nextDouble();
		}
	}
	private static void xuat(String tenSinhVien[], double diemSinhVien[],int n) {
		System.out.println("Danh Sach Sinh Vien ");
		for(int i = 0 ; i < n ; i++ ) {
			System.out.printf("Ten: %s , Diem: %.2f\n ",tenSinhVien[i],diemSinhVien[i]);
		}
	}
}
