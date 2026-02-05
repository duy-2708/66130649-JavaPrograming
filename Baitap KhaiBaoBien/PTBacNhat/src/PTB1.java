import java.util.Scanner;
public class PTB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri a ");
		double a = sc.nextDouble();
		System.out.println("Nhap gia tri b ");
		double b = sc.nextDouble();
		System.out.println("Phương trình có dạng"+ a +"x +"+b+"= 0");
		double kq = (-b) / a;
		System.out.printf("Nghiệm của phương trình là %,.1f " , kq );
	}

}
