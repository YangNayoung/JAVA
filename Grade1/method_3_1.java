// 리턴 값 없고 매개변수 없고 양수인지 음수인지 판단
class method_3_1 {
	public static void a() {
		int x=5;
		if (x<0)
			System.out.println(x+"는 음수입니다.");
		else 
			System.out.println(x+"는 양수입니다.");
	}
	public static void main(String ar[]) {
		method_3_1 m1 = new method_3_1();
		m1.a();
	}
}