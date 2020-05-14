class Math {
	public int Add(int x, int y) {
		return(x+y);
	}
	public int Sub(int x, int y) {
		return(x-y);
	}
	public int Mul(int x, int y) {
		return(x*y);
	}
	public int Div(int x, int y) {
		return(x/y);
	}

	public static void main(String ar[]) {
		Math m1=new Math();
		System.out.println(m1.Add(3,3));
		Math m2=new Math();
		System.out.println(m2.Sub(3,3));
		Math m3=new Math();
		System.out.println(m3.Mul(3,3));
		Math m4=new Math();
		System.out.println(m4.Div(3,3));
	}
}