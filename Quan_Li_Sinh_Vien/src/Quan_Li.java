import java.util.Scanner;
import java.util.ArrayList;
public class Quan_Li {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int a [] = new int [n];
		nhap(sc,a,n);
		xuat(a,n);
		
	}
	private static void nhap(Scanner sc,int a[],int n) {
		System.out.println("Nhap so luong hoc sinh ten va diem ");
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			String [] tenSinhVien = new String[n];
			double [] diemSinhVien = new double[n];
		}
	}
	private static void xuat(int a[] , int n) {
		for(int i = 0 ; i < n ; i++ ) {
			System.out.printf("%d ",a[i]);
		}
	}
}
