import java.util.Scanner;

class Point {
	double x, y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	String toString1() {
		 java.text.DecimalFormat  df=new java.text.DecimalFormat("#.##"); 	df=new java.text.DecimalFormat("#.##");
		return "(" + String.format("%.2f", x).toString() + "," + String.format("%.2f", y).toString() + ")";
	}
}

class Line {
	Point p1;
	Point p2;

	Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	double length() {
		double l1 = p2.x - p1.x;
		double l2 = p2.y - p1.y;
		return Math.sqrt(l1 * l1 + l2 * l2);
	}

	boolean isHorizontal() {
		if (p1.y == p2.y)
			return true;
		else
			return false;
	}

	boolean isVertical() {
		if (p1.x == p2.x)
			return true;
		else
			return false;
	}

	double slope() {
		double y = p2.y - p1.y;
		double x = p2.x - p1.x;
        if (x==0)
			return 0.0/x;
		else
		    return y / x;
	}

	Point getMidPoint() {
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2;
		while (sc.hasNext()) {
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			Point p1 = new Point(x1, y1);
			Point p2 = new Point(x2, y2);
			Line l = new Line(p1, p2);
			System.out.printf("Lenght=%.2f\t", l.length());
			System.out.printf("Is Horizontal=%b\t", l.isHorizontal());
			System.out.printf("Is Vertical=%b\t", l.isVertical());
			System.out.printf("Slope=%.2f\t", l.slope());
			System.out.printf("MidPoint=%s\n", l.getMidPoint().toString1());
		}
	}
}
