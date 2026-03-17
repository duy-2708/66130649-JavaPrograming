package ntu.Duy;
import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		int dem = 0 ;
		int tong = 0 ;
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>() ;
		 Scanner sc = new Scanner(System.in);	
		 System.out.println("Nhap n so nguyen ");
		 int n = sc.nextInt();
		 for(int i = 0 ; i < n ; i++) {
			 System.out.println("Nhap phan tu thu "+i);
			 Integer tam = sc.nextInt();
			 dsSoNguyen.add(tam);
		 }
		 for(int i = 0 ; i < dsSoNguyen.size() ; i++) {
			 Integer tam = dsSoNguyen.get(i);
			 System.out.print(tam + " ");
		 }
		 for(Integer x : dsSoNguyen ) {
			 
			 if(x % 2 == 0 ) {
				 dem++;
			 }
		 }
		 System.out.printf("So phan tu chan la %d\n",dem);
		 for(Integer x : dsSoNguyen) {
			 tong += x ;
		 }
		 System.out.printf("Tong cac phan tu %d\n ",tong);
	}	

}
