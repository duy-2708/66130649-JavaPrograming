import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Quan_Li {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien ");
		 int n = sc.nextInt();
		 String [] tenSinhVien = new String[n];
		double [] diemSinhVien = new double[n];
		nhap(sc,tenSinhVien,diemSinhVien,n);
		xuat(tenSinhVien,diemSinhVien,n);
		Stream_API(diemSinhVien,n);
		tangdan(tenSinhVien,diemSinhVien,n);
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
	private static void Stream_API(double diemSinhVien[],int n) {
		double diemcaonhat = Arrays.stream(diemSinhVien).max().getAsDouble();
		System.out.printf("Diem cao nhat cua  %d sinh vien la %.2f \n",n,diemcaonhat);
		double diemthapnhat = Arrays.stream(diemSinhVien).min().getAsDouble();
		System.out.printf("Diem thap nhat cua  %d sinh vien la %.2f \n",n,diemthapnhat);
		double diemtrungbinh = Arrays.stream(diemSinhVien).average().getAsDouble();
		System.out.printf("Diem trung binh  cua %d sinh vien la %.2f \n ",n,diemtrungbinh);
		
	}
	private static void tangdan(String tenSinhVien[],double diemSinhVien[] ,int n) {
		System.out.println("Diem tang dan cua sinh vien la ");
		for (int i = 0 ; i < diemSinhVien.length ; i++) {
			for (int j = i+1 ; j<diemSinhVien.length ;j++) {
				if(diemSinhVien[i] > diemSinhVien[j]) {
					double tamdiem = diemSinhVien[i] ;
					diemSinhVien[i] = tamdiem ;
					diemSinhVien[i] = diemSinhVien[j];
					diemSinhVien[j] = tamdiem ;
					String tamten = tenSinhVien[i];
					tenSinhVien[i] = tenSinhVien[j];
					tenSinhVien[j] = tamten ;
				}
			}
		}
	}
}
