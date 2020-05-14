// 리턴 값 없고 매개변수 있고 절대값 구하기
class method_2_2 {
	public static void a(int x) {
		if (x<0)
			System.out.println(x+" 절대값: "+-x);
		else 
			System.out.println(x+" 절대값: "+x);
	}
	public static void main(String ar[]) {
		method_2_2 m2 = new method_2_2();
		m2.a(5);
	}
}