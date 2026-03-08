	
	public class Run {
	
		public static void main(String[] args) {
			ChuNhat cn1 = new ChuNhat();
			ChuNhat cn2 = new ChuNhat(20,15);
			ChuNhat hv = new ChuNhat(20,20);
			double cn1_dai = cn1.getDai();
			double cn1_rong = cn2.getRong();
			//
			System.out.printf("Co chieu dai %.1f va chieu rong %.1f " , cn1_dai , cn1_rong);
			cn1.setDai(50);
			System.out.println("\nChieu dai sau khi thay doi ");
			 cn1_dai = cn1.getDai();
			 cn1_rong = cn2.getRong();
			System.out.print("Chieu dai sau khi thay doi la "+cn1_dai 	);
			System.out.println(cn1.toString() );
		}
	
	}
