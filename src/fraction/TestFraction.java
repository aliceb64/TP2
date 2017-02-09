package fraction;

public class TestFraction {
	public static void main(String[] args) {
		Fraction a = new Fraction(3, 4);
		Fraction b = new Fraction(1, 4);

		Fraction c = a.add(b);
		System.out.println(a + " + " + b + " = " + c);

		c = a.sub(b);
		System.out.println(a + " - " + b + " = " + c);
	}
}
