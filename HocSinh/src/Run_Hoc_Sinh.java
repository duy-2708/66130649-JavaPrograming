import java.util.Scanner;

public class Run_Hoc_Sinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HocSinh hs = new HocSinh();
		System.out.println("Nhap Ten Hoc Sinh ");
		hs.setTen(sc.nextLine());
		System.out.println("Nhap nam sinh cua hoc sinh ");
		hs.setTuoi(sc.nextInt());
		System.out.println("Tuoi cua hoc sinh la " + hs.TuoiThat());
	}

}
