// 리턴 값 없고 매개변수 없고 두 수 사이의 합 구하기
class method_4_1 {
	public static void a() {
		int x=1, y=5, sum=0;
		for(int i=x; i<=y; i++){
			sum+=i;
		}
		System.out.println(x+" ~ "+y+" 두 수 사이의 합: "+sum);
	}
	public static void main(String ar[ ]) {
		method_4_1 m1 = new method_4_1();
		m1.a();
	}
}