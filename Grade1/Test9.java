class Test9 {
	int a;
	int b;

	Test9(int x, int y) {
		this(x);
		this.b=30;
	}
	
	Test9(int x) {
		this();
	}

	Test9() {
		this.a=50;
		this.b=100;
	}

	public static void main(String  ar[]) {
		Test9 t=new Test9(10,20);

		System.out.println("this()È£Ãâ");
	}
}