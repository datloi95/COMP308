import java.lang.Math.*;

class Circle {
	double radiusMax = 10;
	double radius;
	double x;
	double y;
	Circle() {
		radius = 0;
		x = 0;
		y = 0;
	}
	Circle(double radius, double x, double y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	public double circumfererence() {
		return 2*Math.PI*radius;
	}
	public double area() {
		return Math.pow(radius,2)*Math.PI;
	}
	public void setRadius(double r) {
		if (r >= radiusMax) {
			r = radiusMax;
		}
		this.radius = r;
	}
	public void printAttributes() {
		System.out.println("x coordinates is " + this.x);
		System.out.println("y coordinates is " + this.y);
	}
	public boolean isInside (double x, double y) {
		double d = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
		if (d < radius) {
			return true;
		}
		else {
			return false;
		}
	}
	public void move(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}
	public static void main(String args[]) {
		Circle testCircle = new Circle(2,2,2);
		System.out.println("Circumference is " + testCircle.circumfererence());
		System.out.println("Area is " + testCircle.area());
		testCircle.printAttributes();
		System.out.println(testCircle.isInside(2,3));
	}
}