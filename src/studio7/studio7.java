package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class studio7 {

	public static void main(String[]args) {
		//Rectangle a = new Rectangle(0.2,0.2);
		//Rectangle b = new Rectangle(0.3,0.4,false);
		//Rectangle c = new Rectangle(.7,.3,false);
		//Rectangle.Drawing(.2,.2);
		//Rectangle.Drawing(.3,.4);
		//Rectangle.Drawing(.7,.3);
		//Die.dieDrawing(8);
		Fraction a = new Fraction(2,4);
		Fraction b = new Fraction(1,4);
		System.out.println(a.sum(1,4));
	}

}
class Rectangle {
	private double length;
	private double width;
	private boolean square;

	public Rectangle() {
		length=0;
		width=0;
		square=false;
	}

	public Rectangle(double l, double w, boolean s) {
		length = l;
		width = w;
		square = s; 
	}

	public static boolean isSquare(double l, double w) {
		if(l==w) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void Drawing(double l, double w) {
		StdDraw.rectangle(.5,.5,l/2,w/2);
		System.out.println(isSquare(l, w));
	}

}

class Die{
	private int sides;
	
	public Die() {
		sides=0;
	}
	public Die(int s) {
		sides=s;
	}
	public static int Sides(int s) {
		s= (int)(Math.random()*s)+1;
		return s;
	}
	public static void dieDrawing(int s) {
		System.out.println(Sides(s));
	}
}

class Fraction{
	private int numerator;
	private int denominator;
	//private int 
	
	
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	public int sum(int n, int d) {
		 int newNumerator = this.numerator + n;
		return newNumerator;
	}
}
