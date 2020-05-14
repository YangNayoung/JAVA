// 리턴 값 없고 매개변수 있고 어떤 값이 짝수인지 홀수인지 판단
class method_1_2 {
	public static void a(int x) {
		
		if (x%2==0)
			System.out.println(x+"는 짝수입니다.");
		else 
			System.out.println(x+"는 홀수입니다.");
	}
	public static void main(String ar[]) {
		method_1_2 m2 = new method_1_2();
		m2.a(5);
	}
}