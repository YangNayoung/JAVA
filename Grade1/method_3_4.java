// 리턴 값 있고 매개변수 있고 양수인지 음수인지 판단
class method_3_4 {
	public String a(int x) {
		if (x<0)
			return(x+"는 음수입니다.");
		else 
			return(x+"는 양수입니다.");
	}
	public static void main(String ar[]) {
		method_3_4 m4 = new method_3_4();
		System.out.println(m4.a(5));
	}
}