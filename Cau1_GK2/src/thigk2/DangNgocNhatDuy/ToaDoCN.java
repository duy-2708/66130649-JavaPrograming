package thigk2.DangNgocNhatDuy;
import java.util.Scanner;
import java.util.ArrayList;
public class ToaDoCN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ToaDo> ds = new ArrayList();
		ToaDo t1 = new ToaDo();
		System.out.println("Nhap toa do ten x1: ");
		t1.setToaX1(sc.nextDouble());
		sc.nextLine();
		System.out.println("Nhap toa do ten y1: ");
		t1.setToaY1(sc.nextDouble());
		sc.nextLine();
		System.out.println("Nhap toa do ten x2: ");
		t1.setToaX2(sc.nextDouble());
		sc.nextLine();
		System.out.println("Nhap toa do ten y2: ");
		t1.setToaY2(sc.nextDouble());
		sc.nextLine();
		ds.add(t1);
		t1.hienThiThongTin();
		}
}
