package date;

public class TestDate {
	public static void main(String[] args) {
		Date a = new Date(8, 12, 2006);
		Date b = new Date(10, 7, 1949);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.infeg(b) + " " + b.infeg(a));
	}
}
