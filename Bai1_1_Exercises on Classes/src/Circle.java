public class Circle {
   private double radius;
   private String color;
   public Circle() {
	   radius = 1.0;
	   color = "red";
   }
   public Circle(double r) {
	   radius = r;
	   color = "red";
   }
//   public Circle(double radius) {
//	   this.radius = radius;
//	   color = "red";
//   }
   //getter
   public double getRadius() {
	   return radius;
   }
   public double getArea() {
	   return radius * radius * Math.PI;
   }
   public String getColor() {
	   return color;
   }
   //setter
   public void setRadius(double newRadius) {
	   radius = newRadius;
   }
   public void setColor(String newColor) {
	   color = newColor;
   }
//   public void setRadius(double radius) {
//	   this.radius = radius;
//   }
   //phương thức khác 
   public String toString() {
	   return "Circle[Bán kính = " + radius + " color = " + color + "]";
   }
}