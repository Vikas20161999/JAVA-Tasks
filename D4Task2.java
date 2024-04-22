package Tasks;

                    /* Day 4 & 5 Task 2 */
import java.util.*;

abstract class Shape {

	public double area() {
		return 0;
	}

}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}

class Rectangle extends Shape {
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		return length * breadth;
	}

}

public class  D4Task2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter radius of a Circle ");
		int r = sc.nextInt();
		Circle circle = new Circle(r);
		System.out.println(" Enter length and breadth of Rectangle ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		Rectangle rectangle = new Rectangle(l, b);

		System.out.println(circle.area());
		System.out.println(rectangle.area());
		sc.close();
	}
}
