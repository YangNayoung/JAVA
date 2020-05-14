// 리턴 값 있고 매개변수 없고 어떤 값이 짝수인지 홀수인지 판단
class method_1_3 {
	public String a() {
		int x=5;
		if (x%2==0)
			return(x+"는 짝수입니다.");
		else 
			return(x+"는 홀수입니다.");
	}
	public static void main(String ar[]) {
		method_1_3 m3 = new method_1_3();
		System.out.println(m3.a());
	}
}