class overloading_Test1 {
	public int add(int x, int y) {
		return(x-y);
	}
	public double add(double x, double y, double z) {
		return(x-y-z);
	}
	public String add(String a, String b) {
		return(a+b);
	}

	public static void main(String ar[]) {
		overloading_Test1 t = new overloading_Test1();
		t.add(2, 3);
		t.add(3.5, 2.8, 9.2);
		System.out.println(t.add("java"," c"));
	}
}