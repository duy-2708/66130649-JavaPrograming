import java.util.Scanner;

public class Tong2So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 , num2 , tong ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mời nhập số thứ nhất ");
		num1 = scanner.nextDouble() ;
		System.out.println("Mời nhập số thứ hai ");
		num2 = scanner.nextDouble() ;
		
		tong = num1 + num2 ;
		
		System.out.printf("Tổng kết quả của  %.2f và %.2f = %.2f\n",num1, num2 ,tong );
		scanner.close();
	}

}
