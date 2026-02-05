import java.util.Scanner;
public class TienLuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số giờ làm ");
		int time = sc.nextInt();
		System.out.println("Nhập tiền lương quy định ");
		int salary = sc.nextInt();
		double kq ;
		if(time > 40 ) {
			int time2 = time - 40 ;
			 kq = time2 * 1.5*salary + 40*salary ;
		}else {
			kq = time * salary ;
		}
		System.out.printf("Tổng thành tiền là %,.0f ",kq);
	}
	

}
