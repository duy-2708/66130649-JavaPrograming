
public class TaiKhoan {
		public String soTaiKhoan ;
		public String tenChuTaiKhoan ;
		public double soDu ;
		public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
			super();
			this.soTaiKhoan = soTaiKhoan;
			this.tenChuTaiKhoan = tenChuTaiKhoan;
			this.soDu = soDu;
		}
		public void guiTien(double soTienGui) {
			if(soTienGui > 0) {
				soDu += soTienGui ;
				System.out.println("So du hien tai"+soDu);
			}
			
		}
		public void rutTien(double soTienRut) {
			if(soTienRut <= soDu) {
				soDu -= soTienRut ;
				System.out.println("So du hien tai: "+soDu);
			}else {
				System.out.println("Khong du tien ");
			}
		}
		public void hienThiThongTin() {
			System.out.println("So tai khoan "+soTaiKhoan);
			System.out.println("Ten: "+tenChuTaiKhoan );
			System.out.println("Tien dang co: "+soDu);
		}
}
