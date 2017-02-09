package flacon;

public class TestFlacon {
	public static void main(String[] args) {
		Flacon a = new Flacon("Très fort", 500);
		Flacon b = new Flacon("Moyen", 2000);

		a.verser(400, 100);
		System.out.println("a : " + a);

		b.verser(100, 100);
		System.out.println("b : " + b);

		b.transvaser(a, 200);
		System.out.println("b : " + b);
	}
}
