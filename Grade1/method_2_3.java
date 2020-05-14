// 리턴 값 있고 매개변수 없고 절대값 구하기
class method_2_3 {
	public int a() {
		int x=-5;
		if (x<0)
			return(-x);
		else 
			return(x);
	}
	public static void main(String ar[]) {
		method_2_3 m3 = new method_2_3();
		System.out.println(m3.a());
	}
}