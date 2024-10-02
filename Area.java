package Assignment_5;
import java.util.Scanner;
public class Area 
{
	protected int length;
	protected int breadth;
	protected int area;
	protected int peri;

	public Area(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

	public void printArea() {
		area = length * breadth;
		System.out.println("Area of Rectangle is " + area);
	}

	public void printPerimeter() {
		peri = area * 2;
		System.out.println("Perimeter of Rectangle is " + peri);
	}
}