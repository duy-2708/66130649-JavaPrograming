import java.util.Scanner;
import java.util.Random;

public class Doan_So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int choitiep;
		do {
			int random = rd.nextInt(100)+1;
			int m = 10 ;
			int count = 1;
			for(int i = 1 ; i<= 10 ; i++) {
				System.out.println("1->100");
				System.out.println("Lan doan thu "+i+".Nhap so du doan ");
				int du_doan = sc.nextInt();
				if(du_doan != random ) {
					if(du_doan > random ) {
						System.out.println("So  dang lon hon");
					}else {
						System.out.println("So dang nho hon ");
					}
					m--;
					count++;
				}else {
					System.out.println("Ban da du doan chinh xac so la "+random);
					break;
				}
		}
			if(m == 0 ) System.out.println("Ban da het luot so random la "+random);
			if (m > 0) {
				System.out.printf("So diem cua ban la %d \n ",(10-count)*10);
			}
			System.out.println("Neu ban muon choi lai nhap so 1");
			choitiep = sc.nextInt();
	}while(choitiep == 1);
	}
}

