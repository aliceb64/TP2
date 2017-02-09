package coordCart;

public class LignePol {
	private Point sommets[];

	public LignePol(int n) {
		sommets = new Point[n];
	}

	public LignePol(Point[] sommets) {
		this.sommets = sommets;
	}

	public Point getSommet(int i) {
		return sommets[i];
	}

	public void setSommet(int i, Point p) {
		sommets[i] = p;
	}

	public String toString() {
		if (sommets.length == 0)
			return "[ ]";

		String res = "[ " + sommets[0];
		for (int i = 1; i < sommets.length; i++)
			res += ", " + sommets[i];
		return res + " ]";
	}

	public Object clone() {
		Point[] bis = new Point[sommets.length];
		for (int i = 0; i < sommets.length; i++) {
			Point p = sommets[i];
			bis[i] = new Point(p.x(), p.y());
		}
		return new LignePol(bis);
	}

	public void homothetie(double k) {
		for (int i = 0; i < sommets.length; i++)
			sommets[i].homothetie(k);
	}

	public void translation(double dx, double dy) {
		for (int i = 0; i < sommets.length; i++)
			sommets[i].translation(dx, dy);
	}

	public void rotation(double a) {
		for (int i = 0; i < sommets.length; i++)
			sommets[i].rotation(a);
	}

	void tracer() {
		for (int i = 1; i < sommets.length; i++)
			tracerSegment((int) sommets[i - 1].x(), (int) sommets[i - 1].y(), (int) sommets[i].x(),
					(int) sommets[i].y());
	}

	public static void main(String[] args) {
		Point[] t = { new Point(1, 3), new Point(0, 2), new Point(0, 0), new Point(2, 2), new Point(2, 4),
				new Point(0, 4), new Point(4, 0), new Point(2, 0), new Point(1, 1) };
		LignePol lp = new LignePol(t);

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double l = Double.parseDouble(args[2]);

		lp.homothetie(l / 4.0);
		lp.translation(a, b);

		lp.tracer();
	}

	// pour la simulation
	static void tracerSegment(int x0, int y0, int x1, int y1) {
		System.out.println("(" + x0 + "," + y0 + ") --> (" + x1 + "," + y1 + ")");
	}
}
