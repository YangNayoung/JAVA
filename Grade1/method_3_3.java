// 리턴 값 있고 매개변수 없고 양수인지 음수인지 판단
class method_3_3 {
	public String a() {
		int x=5;
		if (x<0)
			return(x+"는 음수입니다.");
		else 
			return(x+"는 양수입니다.");
	}
	public static void main(String ar[]) {
		method_3_3 m3 = new method_3_3();
		System.out.println(m3.a());
	}
}