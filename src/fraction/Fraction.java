package fraction;

import java.math.BigInteger;

public class Fraction {
	private BigInteger num, den;

	public Fraction(BigInteger num, BigInteger den) {
		this.num = num;
		this.den = den;
	}

	public Fraction(int n, int d) {
		this(BigInteger.valueOf(n), BigInteger.valueOf(d));
	}

	public Fraction(int n) {
		this(BigInteger.valueOf(n), BigInteger.ONE);
	}

	Fraction add(Fraction f) {
		return new Fraction(num.multiply(f.den).add(den.multiply(f.num)), den.multiply(f.den));
	}

	Fraction sub(Fraction f) {
		return new Fraction(num.multiply(f.den).subtract(den.multiply(f.num)), den.multiply(f.den));
	}

	Fraction mult(Fraction f) {
		return new Fraction(num.multiply(f.num), den.multiply(f.den));
	}

	Fraction divi(Fraction f) {
		return new Fraction(num.multiply(f.den), den.multiply(f.num));
	}

	public String toString() {
		simplifier();
		if (den.equals(BigInteger.ONE))
			return "" + num;
		else
			return num + "/" + den;
	}

	public double doubleValue() {
		simplifier();
		return num.doubleValue() / den.doubleValue();
	}

	private void simplifier() {
		BigInteger gcd = num.gcd(den);
		num = num.divide(gcd);
		den = den.divide(gcd);
	}

}
