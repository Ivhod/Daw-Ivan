package objetos;

public class RationalNumbers {

	private int numerator;
	private int denominator;

	public RationalNumbers() {
		this.numerator = 1;
		this.denominator = 1;

	}

	public RationalNumbers(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		reduce();

	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	public RationalNumbers sumar(RationalNumbers f) {
		
		int d = this.getDenominator() * f.getDenominator();
		int n = this.getNumerator() * f.getDenominator() + this.getDenominator() + f.getNumerator();
		return new RationalNumbers(n,d);

	}

	private void reduce() {
		int gcd = (this.denominator < this.numerator) ? this.denominator : this.numerator;
		while (this.denominator % gcd != 0 || this.numerator % gcd != 0)
			gcd--;
		this.numerator /= gcd;
		this.denominator /= gcd;
	}

}
