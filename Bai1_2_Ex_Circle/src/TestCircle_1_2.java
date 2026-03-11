
public class TestCircle_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chạy constructor và toString
				Circle c1 = new Circle(1.1);
				System.out.println(c1);
				Circle c2 = new Circle();
				System.out.println(c2);
				//chạy setter và getter
				c1.setRadius(2.2);
				System.out.println(c1);
				System.out.println("Bán kính là: "+ c1.getRadius());
				//chạy diện tích và chu vi
				System.out.printf("Diện tích là: %.2f%n", c1.getArea());
				System.out.printf("Chu vi là: %.2f%n", c1.getCircumference());

	}

}
