import java.util.Scanner;
public class NhapXuat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên của bạn  ");
		String name = sc.nextLine();
		System.out.println("Nhập chiều cao của bạn ");
		double height = sc.nextDouble();
		
		System.out.printf("Chào %s Chiều cao của bạn là %,.2f",name,height );
	
	}

}
