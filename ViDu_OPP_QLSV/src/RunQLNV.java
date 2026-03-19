
public class RunQLNV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			NhanVien nv1 = new NhanVien ("001" ,"Dang Ngoc Nhat Duy ",1700000);
//			nv1.hienThiThongTin();
			System.out.print(nv1.toString());
			NhanVienVanPhong nv2 = new NhanVienVanPhong("002 ","Nguyen Dinh Viet",1700000,3,200);
			nv2.hienThiThongTin();
			QuanLi ql1 = new QuanLi("003 ","Tran Van Hao ",1700000,7,12);
			ql1.hienThiThongTin();
			ql1.hopBanGiamDoc();
			NhanVienKinhDoanh kd1 = new NhanVienKinhDoanh("003 ","Nguyen Vo Quoc Viet ",1700000,100,15);
			kd1.hienThiThongTin();
			kd1.chamSocKhachHang();
	}	

}
