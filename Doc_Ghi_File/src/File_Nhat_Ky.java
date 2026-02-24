import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader ;
import java.io.FileWriter ;	
import java.io.IOException ;

public class File_Nhat_Ky {

		private static final String TEN_FILE = "nhatky.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int luachon = 0 ;
			do {
				System.out.println("1.Viet nhat ky moi ");
				System.out.println("2.Doc nhat ky ");
				System.out.println("3.Thoat nhat ky ");
				System.out.println("Nhap lua chon cua ban ");
				try {
					luachon = Integer.parseInt(sc.nextLine());
					switch (luachon) {
					case 1:
						vietNhatKy(sc);
						break;
					case 2:
						docNhatKy();
						break;
					case 3:
						System.out.printf("Da thoat nhat ky ");
						break;
					default:
					System.out.printf("Lua chon chi tu 1->3");
					}
				} catch(NumberFormatException e) {
					System.out.printf("Vui long chi nhap so ");
				}
			} while (luachon !=3 );
			sc.close();
	}
	private static void vietNhatKy(Scanner sc) {
		System.out.println("Hom nay the nao ?");
		String noidung = sc.nextLine();
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEN_FILE,true))) {
			writer.write("-" + noidung );
			writer.newLine();
			System.out.println("Luu thanh cong ");
		} catch (IOException e) {
			System.out.println("Loi "+ e.getMessage());
		}
	}
	private static void docNhatKy() {
		System.out.println("Nhat Ky cua ban");
		try (BufferedReader reader = new BufferedReader(new FileReader(TEN_FILE))){
		String dong ;
			boolean coDuLieu = false; 
				while ((dong = reader.readLine())!= null ) {
					System.out.println(dong);
					coDuLieu = true ;
				}
		if ( !coDuLieu) {
			System.out.println("Khong co gi ca viet them ");
		}
	} catch (IOException e) {
		System.out.println("Loi " +e.getMessage());
	}
}
}
