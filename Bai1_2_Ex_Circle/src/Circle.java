public class Circle {
		   private double radius;
		   public Circle() {
			   radius = 1.0;
		   }
		   public Circle(double r) {
			   radius = r;
		   }
//		   public Circle(double radius) {
//			   this.radius = radius;
//			   color = "red";
//		   }
		   //getter
		   public double getRadius() {
			   return radius;
		   }
		   public double getArea() {
			   return radius * radius * Math.PI;
		   }
		   public double getCircumference() {
			   return 2 * Math.PI * radius;
		   }
		   //setter
		   public void setRadius(double newRadius) {
			   radius = newRadius;
		   } 
		   public String toString() {
			   return "Circle[Bán kính = " + radius + "]";
		   }
		}