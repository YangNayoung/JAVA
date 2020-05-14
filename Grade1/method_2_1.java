// 리턴 값 없고 매개변수 없고 절대값 구하기
class method_2_1 {
	public static void a() {
		int x=-5;
		if (x<0)
			System.out.println(x+" 절대값: "+-x);
		else 
			System.out.println(x+" 절대값: "+x);
	}
	public static void main(String ar[]) {
		method_2_1 m1 = new method_2_1();
		m1.a();
	}
}