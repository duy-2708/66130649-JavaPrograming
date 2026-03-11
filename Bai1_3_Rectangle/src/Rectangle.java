
public class Rectangle {
	private float length = 1.0f ;
	private float width = 1.0f ;
	 public Rectangle() {
	   }
	public Rectangle (float length , float width ) {
		this.length = length ;
		this.width = length ;
	}
	public float getLength() {
		return length ;
	}
	public float getWidth () {
		return width ;
	}
	void setLength (float length ) {
		this.length = length ;
	}
	void setWidth (float width) {
		this.width = width ;
	}
	public float getArea () {
		return length*width ;
	}
	public float getCircumference() {
		return 2*(length+width);
	}
	public String toString () {
		String s ="Length = "+length +"Width = "+ width ;
		return s ;
	}
	

}
