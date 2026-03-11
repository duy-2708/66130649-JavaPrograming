public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.2f, 3.4f);
		System.out.println(r1);  //toString
		Rectangle r2 = new Rectangle();
		System.out.println(r2);
		//chạy setter và getter
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);  //toString
		System.out.println("Chiều dài là: " + r1.getLength());
		System.out.println("Chiều rộng là: " + r1.getWidth());
		//chạy diện tích và chu vi 
		System.out.printf("Diện tích là: %.2f%n", r1.getArea());
		System.out.printf("Chu vi là: %.2f%n", r1.getCircumference());
	}
}