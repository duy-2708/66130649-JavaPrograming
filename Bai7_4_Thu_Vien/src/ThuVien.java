
public class ThuVien {
	public static final int Co_San = 1;
	public static final int Da_Muon = 0;
 private String maSach ;
 private String tenSach ;
 private String tacGia ;
 private int namXuatban;
 private int trangThai = Co_San ;
 public ThuVien(String maSach , String tenSach , String tacGia, int namXuatban ) {
	 this.maSach = maSach ;
	 this.tenSach = tenSach ;
	 this.tacGia = tacGia ;
	 this.namXuatban = namXuatban ;
	 
 }
 public void muonSach() {
	 if(this.trangThai == Co_San) {
		 this.trangThai = Da_Muon;
		 System.out.println("=>Muon sach "+tenSach+" Thanh cong ");
	 }else {
		 System.out.println("Sach nay da co nguoi muon ");
	 }
 }
 public void traSach() {
	 this.trangThai = Co_San ;
	 System.out.println("Sach duoc tra ");
 }
 public void setnamXuatban(int nam) {
	 if(nam > 1900 && nam <=2026) {
		 this.namXuatban = nam ;
	 }else {
		 System.out.println("Nam can tim khong hop le ");
	 }
 }
 public void kiemtraSachcu() {
	 if(this.namXuatban <= 2000) System.out.println("True");
	 else System.out.println("Sach truoc nam 2000");
 }
}
