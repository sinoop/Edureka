package module005_Collections.wrapper;

public class IntegerWrapper {
	public void showTheWork() {
		byte b = 'A';
		Byte bb = b;
		print(b, bb, "byte", "Byte");

		short s = 1223;
		Short ss = s;
		print(s, ss, "short", "Short");

		long l = 1223123123l;
		Long ll = l;
		print(l, ll, "long", "Long");

		int i = 1223123123;
		Integer ii = i;
		print(i, ii, "int", "Integer");

		float f = 12231.23123f;
		Float ff = f;
		print(f, ff, "float", "Float");

		double d = 12231.23123;
		Double dd = d;
		print(d, dd, "double", "Double");

		char c = 'C';
		Character cc = c;
		print(c, cc, "char", "Character");

		boolean bl = true;
		Boolean blbl = bl;
		print(bl, blbl, "boolean", "Boolean");
	}

	private <T, W> void print(T b, W bb, String n1, String n2) {
//		System.out.println(n1 + "\t = " + b + "\t" + n2 + "\t = " + bb);
		System.out.printf("%10s = %-10s \t| %10s = %-10s\n", n1, b, n2, bb);
	}
}
