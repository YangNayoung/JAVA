// 리턴 값 있고 매개변수 있고 어떤 값이 짝수인지 홀수인지 판단
class method_1_4 {
	public String a(int x) {
		if (x%2==0)
			return("짝수");
		else 
			return("홀수");
	}
	public static void main(String ar[]) {
		method_1_4 m4 = new method_1_4();
		System.out.println(m4.a(5));
	}
}