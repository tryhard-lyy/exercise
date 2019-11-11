import java.util.Scanner;

class Fraction {
	int numerator;
	int denominator;

	Fraction(int n, int d) {
        if(d<0)
		{
			n=-n;
			d=-d;
		}
		this.numerator = n;
		this.denominator = d;
	}

	int gcd(int m, int n) {
		m=Math.abs(m);
		n=Math.abs(n);
		int temp;
		while (m % n != 0) {
			temp = m % n;
			m = n;
			n = temp;
		}
		return n;
	}

	Fraction fAdd(Fraction f) {
		int n = numerator * f.denominator + f.numerator * denominator;
		int d = denominator * f.denominator;
		if(d<0)
		{
			n=-n;
			d=-d;
		}
		return new Fraction(n / gcd(n, d), d / gcd(n, d));
	}

	Fraction fMultiply(Fraction f) {
		int n = numerator * f.numerator;
		int d = denominator * f.denominator;
		if(d<0)
		{
			n=-n;
			d=-d;
		}
		return new Fraction(n / gcd(n, d), d / gcd(n, d));
	}
	
	boolean equals(Fraction f) {
		if(f.numerator*denominator == f.denominator * numerator)
			return true;
		else
			return false;
	}
	
	public String toString() {
		
        if (numerator==0)
            return "(" + 0 +")";
		else if (denominator == 1)
			return "(" + numerator + ")";
		else
			return "(" + numerator + "/" + denominator + ")";
			
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n1 = sc.nextInt();
			int d1 = sc.nextInt();
			int n2 = sc.nextInt();
			int d2 = sc.nextInt();
			Fraction f1 = new Fraction(n1, d1);
			Fraction f2 = new Fraction(n2, d2);
			System.out.printf("%1$s + %2$s=%3$s\t", f1, f2, f1.fAdd(f2));
			System.out.printf("%1$s x %2$s=%3$s\t", f1, f2, f1.fMultiply(f2));
			System.out.printf("%1$s == %2$s:%3$6b\n", f1, f2, f1.equals(f2));
		}
	}
}
