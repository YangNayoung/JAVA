// 리턴 값 없고 매개변수 있고 양수인지 음수인지 판단
class method_3_2 {
	public static void a(int x) {
		if (x<0)
			System.out.println(x+"는 음수입니다.");
		else 
			System.out.println(x+"는 양수입니다.");
	}
	public static void main(String ar[]) {
		method_3_2 m2 = new method_3_2();
		m2.a(5);
	}
}