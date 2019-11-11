import java.util.Scanner;

class Rectangle {
	int width, height;

	Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}

	Rectangle() {

	}

	void setWidth(int w) {
		this.width = w;
	}

	void setHeight(int h) {
		this.height = h;
	}

	int getPerimeter() {
		return 2 * (width + height);
	}

	int getArea() {
		return width * height;
	}

	boolean equals(Rectangle r1) {
		if (width == r1.width && height == r1.height)// ||(width == r1.height && height == r1.width)){
			return true;
		else
			return false;
	}

	public String toString() {
		return "Rectangle" + "(" + this.width + "," + this.height + ")";
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int w1 = sc.nextInt();
			int h1 = sc.nextInt();
			int w2 = sc.nextInt();
			int h2 = sc.nextInt();
			Rectangle r1 = new Rectangle(w1, h1);
			Rectangle r2 = new Rectangle();
			r2.setWidth(w2);
			r2.setHeight(h2);
			System.out.printf(r1 + ":Perimeter=%6d\t", r1.getPerimeter());
			System.out.printf("Area=%6d\t", r1.getArea());
			System.out.printf(r2 + ":Perimeter=%6d\t", r2.getPerimeter());
			System.out.printf("Area=%6d\t", r2.getArea());
			System.out.printf("Equals=%b\n", r1.equals(r2));
		}
	}
}
